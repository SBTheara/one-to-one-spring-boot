package com.oneone.oneone.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Transactional
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long address_id;
    private String city;
    private String addressType;

    @OneToOne(mappedBy = "address")
    private Employee employee;

    public Address(String city, String addressType) {
        this.city = city;
        this.addressType = addressType;
    }
}
