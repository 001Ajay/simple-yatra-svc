package com.adas.simple_yatra_svc.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Requester {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long requesterId;

    @NotNull(message = "User Name cannot be null")
    @Size(min = 3, max = 30, message = "User Name must be between 3 and 30 characters")
    private String name;

    @NotNull(message = "Password cannot be null")
    @NotBlank(message = "Password cannot be blank")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column(unique = true)
    private String employeeId;

    @Email( message = "Email is not valid")
    @Column(unique = true)
    private String email;

    @NotNull(message = "Phone number cannot be null")
    @Size(min = 10, max = 13, message = "Phone number must be 10 to 12 characters")
    @Column(unique = true)
    private String phone;

    @Size(min = 3, max = 60, message = "Office address must be 10 to 12 characters")
    private String office;
}
