/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hesco;

/**
 *
 * @author ASUS X455L
 */
public class Pasien extends WargaSekolah{
    
   private String NIS;
   private String Jenkel;
   private String ket_sakit;
   private String Jenis_obat;
   private String Tanggal;
   
    /**
     * @return the NIS
     */
   @Override
    public String getNIS() {
        return NIS;
    }

    /**
     * @param NIS the NIS to set
     */
   @Override
    public void setNIS(String NIS) {
        this.NIS = NIS;
    }

    /**
     * @return the Nama
     */
   @Override
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
   @Override
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Kelas
     */
   @Override
    public String getKelas() {
        return Kelas;
    }

    /**
     * @param Kelas the Kelas to set
     */
   @Override
    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    /**
     * @return the Jenkel
     */
   @Override
    public String getJenkel() {
        return Jenkel;
    }

    /**
     * @param Jenkel the Jenkel to set
     */
   @Override
    public void setJenkel(String Jenkel) {
        this.Jenkel = Jenkel;
    }

    /**
     * @return the ket_sakit
     */
   @Override
    public String getKet_sakit() {
        return ket_sakit;
    }

    /**
     * @param ket_sakit the ket_sakit to set
     */
   @Override
    public void setKet_sakit(String ket_sakit) {
        this.ket_sakit = ket_sakit;
    }

    /**
     * @return the Jenis_obat
     */
   @Override
    public String getJenis_obat() {
        return Jenis_obat;
    }

    /**
     * @param Jenis_obat the Jenis_obat to set
     */
   @Override
    public void setJenis_obat(String Jenis_obat) {
        this.Jenis_obat = Jenis_obat;
    }

    /**
     * @return the Tanggal
     */
   @Override
    public String getTanggal() {
        return Tanggal;
    }

    /**
     * @param Tanggal the Tanggal to set
     */
   @Override
    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }
}
