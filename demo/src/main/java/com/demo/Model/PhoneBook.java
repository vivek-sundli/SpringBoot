package com.demo.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "PhoneBook1")
public class PhoneBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    String firstName;
    String lastName;
    @Column(name = "Gmail")
    String email;
    String phoneNo;
    //public PhoneBook(){}
    public PhoneBook(long id, String firstName, String lastName, String email, String phoneNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
    }
}

