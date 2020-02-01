package com.sio.reactspringserver.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    Long id;
    private String name;
    private String address;
    private String email;
    private String phoneNo;

    public Student(String name, String address, String email, String phoneNo) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
    }
}
