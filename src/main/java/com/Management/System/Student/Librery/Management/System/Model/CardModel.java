package com.Management.System.Student.Librery.Management.System.Model;


import com.Management.System.Student.Librery.Management.System.enums.cardstatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Card")
public class CardModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CardId")
    private int id;

    @Column(name = "CardStatus" , nullable = false)
    @Enumerated(value = EnumType.STRING)
    private cardstatus cardstatus;

    @Column(name = "ExpireDate" , nullable = false)
    private String expiredate;

    @CreationTimestamp
    private Date createddate;

    @UpdateTimestamp
    private Date updateddate;

    @JsonBackReference
    @OneToOne
    @JoinColumn
    private StudentModel stu;

    @JsonManagedReference
    @OneToMany(mappedBy = "card")
    private List<BookModel>  book;

    @JsonManagedReference
    @OneToMany(mappedBy = "card")
    private List<TransactionModel> transactions;

    public CardModel(CardModel cr) {
        this.id = cr.id;
        this.stu = cr.stu;
        this.updateddate = cr.updateddate;
        this.createddate = cr.createddate;
        this.expiredate = cr.expiredate;
        this.cardstatus = cr.cardstatus;
    }

    public List<BookModel> getBook() {
        return book;
    }

    public void setBook(List<BookModel> books) {
        this.book = books;
    }

    public List<TransactionModel> getTransaction() {
        return transactions;
    }

    public void setTransaction(List<TransactionModel> transaction) {
        this.transactions = transaction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentModel getStu() {
        return stu;
    }

    public void setStu(StudentModel stu) {
        this.stu = stu;
    }

    public Date getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    public cardstatus getCardstatus() {
        return cardstatus;
    }

    public void setCardstatus(cardstatus cardstatus) {
        this.cardstatus = cardstatus;
    }
}
