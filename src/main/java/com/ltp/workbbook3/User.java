package com.ltp.workbbook3;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
    
    @NotBlank(message = "firstname field cant be empty")
    @Size(min = 2,message = "too short")
    private String firstName;

    @NotBlank(message = "lastname field cant be empty")
    @Size(min = 2,message = "too short")
    private String lastName;

    @NotBlank(message = "username field cant be empty")
    @Size(min = 7,message = "too short")
    private String username;

    @Email(message = "Invalid Email")
    private String email;

    @Past(message = "date of birth too be in past")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;


    public User(String firstName, String lastName, String username, String email, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public User() {
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
