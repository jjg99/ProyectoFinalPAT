package com.ctf.icaictf.controller;

import com.ctf.icaictf.model.Contacto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SobreNosotrosController {
    
    @GetMapping("/contacto")
    public ResponseEntity<Contacto> getInfoContacto(){
        final Contacto contacto = new Contacto();
        contacto.setCorreo("icr.comillas@gmail.com");
        contacto.setDireccion("C/ Alberto Aguilera 25, 28015 Madrid, España");
        contacto.setTelefono("+34 91 542 28 00");
        contacto.setHorario("lunes a viernes, de 9:00 a 18:00");
        final ResponseEntity<Contacto> response = new ResponseEntity<>(contacto,HttpStatus.OK);
        return response;
    }
}
