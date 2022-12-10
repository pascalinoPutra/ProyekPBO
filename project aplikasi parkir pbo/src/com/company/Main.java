package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilih;

        Mobil mbl = new Mobil();
        Motor mtr =  new Motor();

        Scanner input = new Scanner(System.in);

        System.out.println("\n===== SELAMAT DATANG DI PARKIRAN UAD =====");
        System.out.println("[1] Mobil");
        System.out.println("[2] Motor");
        System.out.print("pilih jenis kendaraaan : ");
        pilih = input.nextInt();
        switch (pilih){
            case 1:
                System.out.println("\n======== parkiran mobil UAD ======");
                mbl.entry();

                break;

            case 2:
                System.out.println("\n======== parkiran mobil UAD ======");
                mbl.entry();
                break;
        }

    }
}
