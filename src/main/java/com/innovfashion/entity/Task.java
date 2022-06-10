package com.innovfashion.entity;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private boolean completado;

    }
