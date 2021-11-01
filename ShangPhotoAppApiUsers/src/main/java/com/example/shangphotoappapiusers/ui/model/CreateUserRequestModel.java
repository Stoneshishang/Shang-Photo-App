package com.example.shangphotoappapiusers.ui.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequestModel {

    @NotNull
    @Size(min = 2, message = "First name must be longer than two characters")
    private String firstName;

    @NotNull
    @Size(min = 2, message = "Last name must be longer than two characters")
    private String lastName;

    @NotNull(message = "Password cannot be null")
    @Size(min = 2, max = 16, message = "Password must be equal or greater than 2 characters")
    private String password;

    @NotNull(message = "Email cannot be null")
    @Email
    private String email;
}
