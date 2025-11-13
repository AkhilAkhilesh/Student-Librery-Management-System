package com.Management.System.Student.Librery.Management.System.Model;


import com.Management.System.Student.Librery.Management.System.enums.cardstatus;
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

    @OneToOne
    private StudentModel stu;

    @OneToMany(mappedBy = "card")
    private List<BookModel>  books;

    @OneToMany(mappedBy = "card")
    private List<TransactionModel> transactions;

    public List<BookModel> getBooks() {
        return books;
    }

    public void setBooks(List<BookModel> books) {
        this.books = books;
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
