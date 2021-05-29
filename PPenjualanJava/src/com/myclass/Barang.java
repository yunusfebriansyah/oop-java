package com.myclass;

// Penjualan sederhana
// class Barang
abstract class Barang{

  // property / attribute
  private String namaBarang = "belum ada nama";
  private int hargaBarang = 0;
  private int stokBarang = 0;

  // method abstract
  public abstract String tampilJenisBarang();

  // Method Constructor
  public Barang()
  {}

  public Barang(String namaBarang)
  { 
    this.namaBarang = namaBarang;
  }

  public Barang(String namaBarang, int hargaBarang)
  { 
    this.namaBarang = namaBarang;
    this.hargaBarang = hargaBarang;
  }

  public Barang( String namaBarang, int hargaBarang, int stokBarang )
  {
    this.namaBarang = namaBarang;
    this.hargaBarang = hargaBarang;
    this.stokBarang = stokBarang;
  }
  

  // Method Wajib
  public void tambahStok()
  {
    stokBarang += 1;
    System.out.println("Stok barang berhasil ditambahkan menjadi : " + stokBarang + "\n");
  }
  public void tambahStok(int jmlTambah)
  {
    stokBarang += jmlTambah;
    System.out.println("Stok barang berhasil ditambahkan menjadi : " + stokBarang + "\n");
  }

  public void kurangiStok()
  {
    stokBarang -= 1;
    System.out.println("Stok barang berhasil dikurangi menjadi : " + stokBarang + "\n");
  }

  public void kurangiStok(int jmlKurang)
  {
    stokBarang -= jmlKurang;
    System.out.println("Stok barang berhasil dikurangi menjadi : " + stokBarang + "\n");
  }

  // Masih ada stok barang gak?
  public boolean cekStok()
  {
    if( stokBarang > 0 ){
      return true;
    }else{
      return false;
    }
  }

  public boolean cekStok( boolean status )
  {
    if( status ){
      // stok barang masih kan??
      if( stokBarang > 0 ){
        return true;
      }else{
        return false;
      }
    }else{
      // stok barang udah abis kan?
      if( stokBarang > 0 ){
        return false;
      }else{
        return true;
      }
    }
  }

  public void cetakInfoBarang()
  {
    System.out.print("Nama Barang : " + this.namaBarang + ", Harga Barang : Rp." + this.hargaBarang + ", Stok Barang : " + this.stokBarang +"pcs");
  }

  // Method Setter
  public void setNamaBarang( String namaBarang )
  {
    this.namaBarang = namaBarang;
  }

  public void setHargaBarang( int hargaBarang )
  {
    this.hargaBarang = hargaBarang;
  }

  public void setStokBarang( int stokBarang )
  {
    this.stokBarang = stokBarang;
  }

  // Method Getter
  public String getNamaBarang()
  {
    return this.namaBarang;
  }

  public int getHargaBarang()
  {
    return this.hargaBarang;
  }

  public int getStokBarang()
  {
    return this.stokBarang;
  }



}
