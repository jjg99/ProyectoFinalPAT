package com.ctf.icaictf.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {
    @Size(min=4, max=24)
    private String username;
    
    @NotBlank
    @Size(min=4, max=24)
    private String password;

    private String country;

    private String country_code;

    private int position;

}
