package com.company;

 public abstract class Kendaraan {
	private String platNomer;
	private double jamMasuk;

	 public Kendaraan() {
	 }

	 public String getPlatNomer() {
		return platNomer;
	}

	public void setPlatNomer(String pn) {
		this.platNomer = pn;
	}

	public double getJamMasuk() {
		return jamMasuk;
	}

	public void setJamMasuk(double jamMasuk) {
		this.jamMasuk = jamMasuk;
	}
	abstract public void entry();
	abstract public void cetakKarcis();



}
