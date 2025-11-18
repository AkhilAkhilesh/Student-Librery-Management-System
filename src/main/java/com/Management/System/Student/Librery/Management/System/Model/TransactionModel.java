package com.Management.System.Student.Librery.Management.System.Model;

import com.Management.System.Student.Librery.Management.System.enums.transactiontype;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.mapping.Value;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Transaction")
public class TransactionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TransactionId")
    private int id;

    @Column(name = "TransactionDate")
    @CreationTimestamp
    private LocalDate transactiondate;

    @Column(name = "DueDate")
    private String duedate;

    @Column(name = "Type")
    @Enumerated(value = EnumType.STRING)
    private transactiontype transactiontype;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "Card", referencedColumnName = "CardId")
    private CardModel card;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "Books", referencedColumnName = "BookId")
    private BookModel book;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookModel getBook() {
        return book;
    }

    public void setBook(BookModel book) {
        this.book = book;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public transactiontype getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(transactiontype transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public LocalDate getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(LocalDate transactiondate) {
        this.transactiondate = transactiondate;
    }
}
