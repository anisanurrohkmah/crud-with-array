package com.perpustakaan.service;
import com.perpustakaan.entity.Majalah;
import com.perpustakaan.entity.Novel;


import java.util.LinkedList;


public class inventoryServiceImpl implements inventoryService {

    LinkedList<Majalah> list1;
    LinkedList<Novel> list2;



    // Default Constructor
    public inventoryServiceImpl()
    {
          list1 = new LinkedList<>();
          list2 = new LinkedList<>();
    }
    @Override
    public void searchBook(String cari) {
        for (Majalah l : list1) {
            String x = l.getTitle();
            if (x.equalsIgnoreCase(cari)) {
                System.out.println(l);
            }
        }
        for (Novel n : list2) {
            String y = n.getTitle();
            if (y.equalsIgnoreCase(cari)) {
                System.out.println(n);
            }
            else {
                System.out.println("book not found");
            }
        }
    }

    public void getAllBook() {

        if (list1.isEmpty()) {
            System.out.println("The list has no records\n");
        }
        for (Majalah majalah : list1) {
            System.out.println(majalah.toString());
        }

        if (list2.isEmpty()) {
            System.out.println("The list has no records\n");
        }
        for (Novel novel : list2) {
            System.out.println(novel);
        }
    }

    @Override
    public void addMajalah(Majalah majalah)
    {
             list1.add(majalah);
    }

    @Override
    public void delBook(String search) {
        Majalah majalahDel = null;
        for (Majalah mj : list1) {
            String smt =mj.getTitle();
            if ( smt.equalsIgnoreCase(search) ) {
                majalahDel = mj;
            }
        }

        if (majalahDel == null) {
            System.out.println("Invalid record Id");
        }
        else {
            list1.remove(majalahDel);
            System.out.println("Successfully removed record from the list");
        }
    }

    @Override
    public void addNovel(Novel novel)
    {
        list2.add(novel);

    }




}
