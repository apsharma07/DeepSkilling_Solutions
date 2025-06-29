package org.example.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    private Long id;

    private String name;
    private String email;

}
