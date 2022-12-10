package com.company;

public class Motor extends Kendaraan{
	@Override
	public void entry() {
		System.out.print("Masukan nomer plat : ");
		plat=in.nextLine();
		System.out.print("Jam masuk : ");
		jamMasuk=in.nextDouble();

	}

	@Override
	public void cetakKarcis() {
		System.out.println("============ Karcis Masuk ==========");
		System.out.println("== selamat datang di parkiran UAD ==");
		System.out.println("motor 2000 (flat) ");
		System.out.println("waktu masuk : "+getJamMasuk());
		System.out.println("Plat nomer motor : "+getPlatNomer());
	}
}
