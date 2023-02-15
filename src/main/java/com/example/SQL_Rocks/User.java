package com.example.SQL_Rocks;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="user_info")
public class User {

    @Id
    private int id;

    private String name;
    private String age;
    private String mobNo;

    @Column(name="country_name")
    private String country;
    @Column(unique = true)
    private String email;

    User(){}

    public User(int id, String name, String age, String mobNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo=mobNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
