package com.makeienko.mvcandhibernate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "rental_car")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClientId")
    private int id;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Age")
    private int age;
    @Column(name = "Email")
    private String email;
    @Column(name = "ModelCar")
    private String modelCar;

    public Client() {
    }

    public Client(String firstName, String lastName, int age, String email, String modelCar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.modelCar = modelCar;
    }
}
