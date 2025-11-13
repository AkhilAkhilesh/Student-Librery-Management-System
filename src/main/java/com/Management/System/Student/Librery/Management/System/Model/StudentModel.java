package com.Management.System.Student.Librery.Management.System.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentId")
    private int id;

    @Column(name = "StudentName"  , nullable = false)
    private String name;

    @Column(name = "Email"  , nullable = false, unique = true)
    private String email;

    @Column(name = "Dept"  , nullable = false)
    private String dept;

    @Column(name = "sem" )
    private  int sem;

    @Column(name = "Gender"  , nullable = false)
    private String gender;

    @Column(name="Address",nullable = false)
    private String address;

    @OneToOne
    private CardModel card;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
