package com.ctf.icaictf.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserChangePasswordRequest {

    @NotNull
	@NotEmpty
	@Pattern(message="la contraseña debe tener entre 1-15 caracteres" , regexp="^[a-zA-Z-.0-9]{1,15}$")
    private String currentPassword;

    @NotNull
	@NotEmpty
	@Pattern(message="la contraseña debe tener entre 1-15 caracteres" , regexp="^[a-zA-Z-.0-9]{1,15}$")
    private String newPassword;

    @NotNull
	@NotEmpty
	@Pattern(message="la contraseña debe tener entre 1-15 caracteres" , regexp="^[a-zA-Z-.0-9]{1,15}$")
    private String newPassword2;
}

