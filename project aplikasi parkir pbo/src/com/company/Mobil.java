package com.company;

import java.util.Scanner;

public class Mobil extends Kendaraan{
	private String plat;
	private double jamMasuk;
	Scanner in = new Scanner(System.in);

	@Override
	public void entry() {
		System.out.print("Masukan nomer plat : ");
		plat=in.nextLine();
		System.out.print("Jam masuk : ");
		jamMasuk=in.nextDouble();

	}

	@Override
	public void cetakKarcis() {
		System.out.println("============ Karcis Masuk Mobil ==========");
		System.out.println("== selamat datang di parkiran UAD ==");
		System.out.println("mobil 3000/jam (max 100.000) ");
		System.out.println("waktu masuk : "+getJamMasuk());
		System.out.println("Plat nomer mobil : "+getPlatNomer());
	}
}
