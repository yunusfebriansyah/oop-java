package com.myclass;

public class Processor extends Barang {
  
  // property
  private double frekuensiDasar = 0;
  private double turboBoost = 0;

  // overriding method abstract
  public String tampilJenisBarang()
  {
    return "Ini processor";
  }

  public Processor( String namaBarang, int hargaBarang, int stokBarang, double frekuensiDasar, double turboBoost )
  {
    super(namaBarang, hargaBarang, stokBarang);
    this.frekuensiDasar = frekuensiDasar;
    this.turboBoost = turboBoost;
  }

  // setter dan getter
  public void setFrekuensiDasar( double frekuensiDasar )
  {
    this.frekuensiDasar = frekuensiDasar;
  }
  public double getFrekuensiDasar()
  {
    return this.frekuensiDasar = frekuensiDasar;
  }

  public void setTurboBoost( double turboBoost )
  {
    this.turboBoost = turboBoost;
  }
  public double getTurboBoost()
  {
    return this.turboBoost = turboBoost;
  }

  // Overriding
  @Override
  public void cetakInfoBarang()
  {
    super.cetakInfoBarang();
    System.out.println(", Frekuensi Dasar : " + this.frekuensiDasar + ", Turbo Boost : " + this.turboBoost + "\n");
  }

}
