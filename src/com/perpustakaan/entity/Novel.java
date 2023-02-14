package com.perpustakaan.entity;

import com.perpustakaan.entity.Book;

public class Novel extends Book {
    private String author;

    @Override
    public String toString() {
        return "Type : Novel, " +
                "code='" + code + '\'' +
                ", judul='" + title + '\'' +
                ", penerbit='" + publisher + '\'' +
                ", thn='" + year + '\'' +
                ", penulis='" + author + '\'' ;
    }

    @Override
    public String getTitle() {
        return title;
    }

    //    public Novel(){}
    public Novel(String code, String title, String publisher, String year, String author) {
        this.code = code;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.author = author;
    }


}
