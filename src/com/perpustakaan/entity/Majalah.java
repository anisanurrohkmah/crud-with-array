package com.perpustakaan.entity;

public class Majalah extends Book {

    @Override
    public String toString() {
        return "Type : Majalah, " +
                "code='" + code + '\'' +
                ", judul='" + title + '\'' +
                ", penerbit='" + publisher + '\'' +
                ", thn='" + year + '\'' ;
    }

//    public Majalah(){}
    public Majalah(String code, String title, String publisher, String year) {
        this.code = code;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }
    public String getTitle(){
        return  title;
    }


}
