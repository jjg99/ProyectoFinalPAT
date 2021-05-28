package com.ctf.icaictf.controller;

import java.util.List;

import com.ctf.icaictf.model.Contacto;
import com.ctf.icaictf.model.UserDetail;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @PostMapping("/api/v1/login")
	public ResponseEntity<String> create(@RequestBody String message) {
		System.out.print(message);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

    @GetMapping("/api/home/podio")
    public ResponseEntity<List<UserDetail>> helloWorld() {
		final UserDetail user1 = new UserDetail();
		user1.setUsername("jjg99");
        user1.setCountry("Estados Unidos de Ámerica");
        user1.setCountry_code("US");
        //user1.setPosition(1);
		final UserDetail user2 = new UserDetail();
		user2.setUsername("J0nan");
        user2.setCountry("Canada");
        user2.setCountry_code("CA");
        //user2.setPosition(2);
		final UserDetail user3 = new UserDetail();
		user3.setUsername("ICAI");
        user3.setCountry("España");
        user3.setCountry_code("ES");
        //user3.setPosition(3);
        final UserDetail user4 = new UserDetail();
		user4.setUsername("Felíx");
        user4.setCountry("Argentina");
        user4.setCountry_code("AR");
        //user4.setPosition(4);
		final UserDetail user5 = new UserDetail();
		user5.setUsername("Diamante");
        user5.setCountry("España");
        user5.setCountry_code("ES");
        //user5.setPosition(5);
		final UserDetail user6 = new UserDetail();
		user6.setUsername("Tom");
        user6.setCountry("Estados Unidos de Ámerica");
        user6.setCountry_code("US");
        //user6.setPosition(6);
        final List<UserDetail> users = List.of(user1, user2, user3, user4, user5, user6);
        final ResponseEntity<List<UserDetail>> response = new ResponseEntity<>(users, HttpStatus.OK);
        return response;
	}
    
    @GetMapping("/api/detalle/{usuario}")
    public ResponseEntity<String> user2pais(@PathVariable String usuario) {
        String pais;
        if(usuario == "Javi") {
            pais = "Estados Unidos de Ámerica"; 
        } else {
            pais = "España";
        }
		final ResponseEntity<String> response = new ResponseEntity<>(pais, HttpStatus.OK);
		return response;
	}

    @GetMapping("/api/contact")
	public ResponseEntity<Contacto> contact(@RequestBody String message) {
		final Contacto contacto = new Contacto();
        contacto.setCorreo("icr.comillas@gmail.com");
        contacto.setDireccion("C/ Alberto Aguilera 25, 28015 Madrid, España");
        contacto.setTelefono("+34 91 542 28 00");
        contacto.setHorario("lunes a viernes, de 9:00 a 18:00");
		return new ResponseEntity<>(contacto, HttpStatus.OK);
	}
}
