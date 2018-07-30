package com.i9.postgresdemo.model;


import org.apache.avro.Schema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name = "employeename")
    private String employeeName;

    @Column(name = "contno")
    private String contNo;

    @Column(name = "SSN")
    private String SSN;

    @Column(name = "doB")
    private String dOB;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName ;

    @Column(name = "middlename")
    private String middleName;

    @Column(name = "address")
    private String address;

    @Column(name = "doorno")
    private String apptNo;

    @Column(name = "street")
    private String street;

    @Column(name = "town")
    private String city;

    @Column(name = "state")
    private String state;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApptNo() {
        return apptNo;
    }

    public void setApptNo(String apptNo) {
        this.apptNo = apptNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public void put(int i, Object o) {

    }
}
