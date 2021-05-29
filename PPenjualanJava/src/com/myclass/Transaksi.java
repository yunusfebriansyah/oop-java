package com.myclass;

public class Transaksi {

  public Transaksi( Penjual penjual, Pembeli pembeli, Barang barang )
  {

    System.out.println("Penjual : " + penjual.getNama() + ", Pembeli : " + pembeli.getNama() + ", Barang : " + barang.getNamaBarang() + ", Jenis Barang : " + barang.tampilJenisBarang() + "\n");

    int stokBaru = barang.getStokBarang() - 1;

    barang.setStokBarang(stokBaru);

  }
  
}
