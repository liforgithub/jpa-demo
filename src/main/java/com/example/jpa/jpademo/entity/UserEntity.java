package com.example.jpa.jpademo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "age", length = 100)
    private Integer age;
}
