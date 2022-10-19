package com.motomania.motoshop.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String email;

    private String phone;
}
