package com.offcn.bean;

public class Book {
    private Integer bid;
    private String title; //和表中不一致
    private double price; //和表中不一致
    private String bauthor;
    private String bdesc;

    public Book() {
    }

    public Book( String title, double price, String bauthor, String bdesc) { this.bid = bid;
        this.title = title;
        this.price = price;
        this.bauthor = bauthor;
        this.bdesc = bdesc;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public String getBdesc() {
        return bdesc;
    }

    public void setBdesc(String bdesc) {
        this.bdesc = bdesc;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", bauthor='" + bauthor + '\'' +
                ", bdesc='" + bdesc + '\'' +
                '}';
    }
}
