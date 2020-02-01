package com.sio.reactspringserver.builder;

import com.sio.reactspringserver.domain.Student;

public class StudentBuilder {
    private String name;
    private String address;
    private String email;
    private String phoneNo;

    public String getName() {
        return this.name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public StudentBuilder setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public Student getStudentInFormation() {
        return new Student(name, phoneNo, address, email);
    }
}
