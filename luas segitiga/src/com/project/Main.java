package com.project;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //membuat data
        double luas;
        int alas;
        int tinggi;
        Scanner david = new Scanner(System.in);

        //memanggil data
        System.out.print("Masukkan alas = ");
        alas = david.nextInt();
        System.out.print("Masukkan tinggi = ");
        tinggi = david.nextInt();

        //memasukkan perintah
        luas = (alas * tinggi) / 2;
        System.out.println("luas segitiga = " + luas);
    }
}