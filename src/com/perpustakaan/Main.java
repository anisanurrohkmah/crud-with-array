package com.perpustakaan;

import com.perpustakaan.entity.Majalah;
import com.perpustakaan.entity.Novel;
import com.perpustakaan.service.inventoryServiceImpl;

import java.util.Scanner;

public class Main {
     static int option = 0;

    public static void main(String[] args)
    {
            inventoryServiceImpl ivenS = new inventoryServiceImpl();

            Majalah majalah = new Majalah("123","Forbes","Erlangga","2019");
            Novel novel = new Novel("xxx","Naruto","john","2020","Joko");

            ivenS.addMajalah(majalah);
            ivenS.addNovel(novel);

             Scanner opsi = new Scanner(System.in);

        do {
            listMenu();
            Scanner search = new Scanner(System.in);

            switch (option) {
                case 1:
                    System.out.println("=".repeat(25));
                    System.out.println("Inputkan jenis buku : ");
                    System.out.println("1.\tNovel");
                    System.out.println("2.\tMajalah");
                    System.out.println("=".repeat(25));
                    String varietyBook = opsi.nextLine();

                    if (varietyBook.equalsIgnoreCase("1")) {
                        System.out.print("Masukkan code buku : ");
                        String newCode = opsi.nextLine();
                        System.out.print("Masukkan judul buku : ");
                        String newTitle = opsi.nextLine();
                        System.out.print("Masukkan nama penerbit buku : ");
                        String newTerbit = opsi.nextLine();
                        System.out.print("Masukkan tahun terbit buku : ");
                        String newTahun = opsi.nextLine();
                        System.out.print("Masukkan penulis : ");
                        String newPenulis = opsi.nextLine();

                        novel = new Novel(newCode, newTitle, newTerbit, newTahun, newPenulis);
                        ivenS.addNovel(novel);
                        System.out.println(novel.toString());

                    }
                    else  if (varietyBook.equalsIgnoreCase("2")) {
                        System.out.print("Masukkan code buku : ");
                        String newCode = opsi.nextLine();
                        System.out.print("Masukkan judul buku : ");
                        String newTitle = opsi.nextLine();
                        System.out.print("Masukkan nama penerbit buku : ");
                        String newTerbit = opsi.nextLine();
                        System.out.print("Masukkan tahun terbit buku : ");
                        String newTahun = opsi.nextLine();

                        majalah = new Majalah(newCode, newTitle, newTerbit, newTahun);
                        ivenS.addMajalah(majalah);
                        System.out.println(majalah.toString());
                    }

                    break;
                    case 2: ivenS.getAllBook();
                    break;

                    case 3:
                    System.out.print("Masukkan Judul buku : ");
                    String titleSearch = search.nextLine();
                    ivenS.searchBook(titleSearch);
                    break;

                    case 4:
                    System.out.print("Masukkan Judul buku : ");
                    String titleSearch2 = search.nextLine();
                    ivenS.delBook(titleSearch2);
                    break;

                default:
                    System.out.println("\nInvalid input\n");
                    break;
            }
        }

        while (option != 9);
    }

    public static void listMenu(){
            Scanner input = new Scanner(System.in);
             System.out.println("=".repeat(25));
            System.out.println("Welcome To Enigpus Inventory");
            System.out.println("=".repeat(25));
            System.out.println("1.\tTambahkan buku");
            System.out.println("2.\tLihat list buku");
            System.out.println("3.\tCari buku berdasarkan judul");
            System.out.println("4.\tHapus buku berdasarkan judul");
            System.out.println("5.\tKeluar dari aplikasi");
            System.out.println("=".repeat(25));
             option = input.nextInt();
    }
}
