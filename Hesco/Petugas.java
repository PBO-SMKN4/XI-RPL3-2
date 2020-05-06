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
public class Petugas extends WargaSekolah implements PMR{
    private String Username;
    private String Password;
    private String no_hp;

    /**
     * @return the Username
     */
    @Override
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    @Override
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    @Override
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    @Override
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the no_hp
     */
    @Override
    public String getNo_hp() {
        return no_hp;
    }

    /**
     * @param no_hp the no_hp to set
     */
    @Override
    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
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
    
    // INTERFACE METHOD
    @Override
    public void perawat() {
    
    }
}
