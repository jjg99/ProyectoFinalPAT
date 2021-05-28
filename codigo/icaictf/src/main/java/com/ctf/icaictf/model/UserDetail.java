package com.ctf.icaictf.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("USERS")
public class UserDetail {
    @NotBlank
    @Id
    @Size(min=4, max=24)
    private String username;
    
    @NotBlank
    @Size(min=4, max=24)
    private String password;

    private String country;

    private String country_code;

    //@NotBlank
    private String role;

}
