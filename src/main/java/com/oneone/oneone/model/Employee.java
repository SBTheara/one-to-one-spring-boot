package com.oneone.oneone.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@Transactional
@Entity
@Table(name = "employe")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employee_id;
    private String name;
    private String age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_id")
    private Address address;

    public Employee(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
