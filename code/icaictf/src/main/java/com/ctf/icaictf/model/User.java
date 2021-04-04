package com.ctf.icaictf.model;

import lombok.Data;

@Data
public class User {

    private String username;
    
    private String password;

    private String country;

    private String country_code;

    private int position;

}
