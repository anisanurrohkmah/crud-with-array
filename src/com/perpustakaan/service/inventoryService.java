package com.perpustakaan.service;


import com.perpustakaan.entity.Majalah;
import com.perpustakaan.entity.Novel;

public interface inventoryService {

      void searchBook(String search);
      void delBook(String search);
      void getAllBook();
     void addMajalah(Majalah majalah);
     void addNovel(Novel novel);

}
