package com.ctf.icaictf.controller;

import javax.validation.Valid;

import com.ctf.icaictf.config.JwtTokenUtil;
import com.ctf.icaictf.model.UserChangePasswordRequest;
import com.ctf.icaictf.model.jwtdata.JwtRequest;
import com.ctf.icaictf.model.jwtdata.JwtResponse;
import com.ctf.icaictf.service.impl.JwtUserDetailsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtAuthenticationController {
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;

	@Autowired
	private JwtUserDetailsServiceImpl jwtUserDetailsServiceImpl;

	@PostMapping(value = "/api/login")
	public ResponseEntity<?> login(@Valid @RequestBody JwtRequest authenticationRequest) throws Exception {

		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		final UserDetails userDetails = jwtInMemoryUserDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		final String token = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok().body(new JwtResponse(token));
	}

	@PostMapping(value = "/api/users/update-password")
	public ResponseEntity<?> login(@RequestHeader("Authorization") String headerToken, @RequestBody UserChangePasswordRequest bodyPassParams) {
		String idToken = null;

		if(headerToken != null && headerToken.startsWith("Bearer ")) {
			// Limpieza del token, ya que siempre lleva Bearer antes
			idToken = headerToken.replaceFirst("Bearer ", "");
			
			try {
				// Comporbacion del usuario y de la contraseña
				authenticate(jwtTokenUtil.getUsernameFromToken(idToken), bodyPassParams.getCurrentPassword());

				// Comprobacion de que las contraseñas sean iguales
				if(bodyPassParams.getNewPassword().equals(bodyPassParams.getNewPassword2())) {
				
					jwtUserDetailsServiceImpl.changePassword(jwtTokenUtil.getUsernameFromToken(idToken), bodyPassParams.getNewPassword());
					
				} else {
					return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
				}

			} catch(Exception exp) {
				return new ResponseEntity<>(exp.getMessage(), HttpStatus.UNAUTHORIZED);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

	/* @GetMapping(value = "/api/users/validate-token/{token}")
	public ResponseEntity<String> validateToken(@PathVariable)
 */
	private void authenticate(String username, String password) throws Exception {

		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}

}
