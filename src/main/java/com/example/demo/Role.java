//package com.example.demo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "roles")
//public class Role {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Enumerated(EnumType.STRING)
//    @Column(length = 20)
//    private ERole name;
//
//    // Getters and Setters
//
//    public Role() {
//    }
//
//    public Role(ERole name) {
//        this.name = name;
//    }
//
//    // Getters and Setters
//}
//
//public enum ERole {
//    ROLE_USER,
//    ROLE_MODERATOR,
//    ROLE_ADMIN
//}
