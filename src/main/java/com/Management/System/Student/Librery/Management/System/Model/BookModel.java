package com.Management.System.Student.Librery.Management.System.Model;

import com.Management.System.Student.Librery.Management.System.enums.bookcategory;
import com.Management.System.Student.Librery.Management.System.enums.bookavailability;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Books")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BookId")
    private int id;

    @Column(name = "Title", nullable = false, unique = true)
    private String title;

    @Column(name = "Pages",nullable = false)
    private int pages;

    @Column(name = "PublisherName",nullable = false)
    private String publishername;

    @Column(name = "PublisherDate",nullable = false)
    private String publishdata;

    @Column(name = "Availlable",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private bookavailability isavailable;

    @Column(name = "Category",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private bookcategory category;

    @ManyToOne
    @JoinColumn(name = "Card_Id", referencedColumnName = "CardId")
    private CardModel card;

    @OneToMany(mappedBy = "book")
    private List<TransactionModel> transaction;

    public List<TransactionModel> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<TransactionModel> transaction) {
        this.transaction = transaction;
    }

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

    public bookcategory getCategory() {
        return category;
    }

    public void setCategory(bookcategory category) {
        this.category = category;
    }

    public bookavailability getIsavailable() {
        return isavailable;
    }

    public void setIsavailable(bookavailability isavailable) {
        this.isavailable = isavailable;
    }

    public String getPublishdata() {
        return publishdata;
    }

    public void setPublishdata(String publishdata) {
        this.publishdata = publishdata;
    }

    public String getPublishername() {
        return publishername;
    }

    public void setPublishername(String publishername) {
        this.publishername = publishername;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
