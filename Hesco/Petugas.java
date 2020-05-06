/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hesco;

import Hesco.Connection.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


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
    
    Connection koneksi;
    // INTERFACE METHOD
    @Override
    public void mengisiData(JTextField txtKdObat, JTextField txtMerk, JTextField txtEXP, JComboBox cmbJenis, JTextField txtStok, JTextField txtKet) {
        koneksi = DatabaseConnection.getKoneksi("localhost", "5432", "postgres", "posgre", "db_hesco");
        
        MainHesco.obat.setKd_obat(txtKdObat.getText());
        MainHesco.obat.setMerk(txtMerk.getText());
        MainHesco.obat.setTanggal_kadaluarsa(txtEXP.getText());
        MainHesco.obat.setJenis_obat(cmbJenis.getSelectedItem().toString());
        MainHesco.obat.setStok_obat(txtStok.getText());
        MainHesco.obat.setKet_obat(txtKet.getText());
        
        try{
            Statement stmt = koneksi.createStatement();
            String query = "INSERT INTO obat(kd_obat, merk, tanggal_kadaluarsa, jenis_obat, stok_obat, ket_obat)" +
                    " VALUES('" + MainHesco.obat.getKd_obat() + "','" + MainHesco.obat.getMerk() + "','" + MainHesco.obat.getTanggal_kadaluarsa()
                    + "','" + MainHesco.obat.getJenis_obat() + "','" + MainHesco.obat.getStok_obat() + "','" + MainHesco.obat.getKet_obat() + "')";
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            if(berhasil == 1){
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
            }else{
                JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // OVERLOAD
    public void mengisiData(JTextField txtNIS, JTextField txtNama, JTextField txtKelas, JComboBox cmbJenkel, JTextField txtSakit, JTextField txtJenis, JTextField txtTanggal){
        koneksi = DatabaseConnection.getKoneksi("localhost", "5432", "postgres", "posgre", "db_hesco");
        
        MainHesco.pasien = new Pasien();
        MainHesco.pasien.setNIS(txtNIS.getText());
        MainHesco.pasien.setNama(txtNama.getText());
        MainHesco.pasien.setKelas(txtKelas.getText());
        MainHesco.pasien.setJenkel(cmbJenkel.getSelectedItem().toString());
        MainHesco.pasien.setKet_sakit(txtSakit.getText());
        MainHesco.pasien.setJenis_obat(txtJenis.getText());
        MainHesco.pasien.setTanggal(txtTanggal.getText());
        
        try{
            Statement stmt = koneksi.createStatement();
            String query = "INSERT INTO pasien(nis, nama, kelas, jenkel, ket_sakit, jenis_obat, tanggal)" +
                            "VALUES('" + MainHesco.pasien.getNIS() + "','" + MainHesco.pasien.getNama() + "','" + MainHesco.pasien.getKelas()
                    + "','" + MainHesco.pasien.getJenkel() + "','" + MainHesco.pasien.getKet_sakit() + "','" + MainHesco.pasien.getJenis_obat() + "','" 
                    + MainHesco.pasien.getTanggal() + "')";
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            if(berhasil == 1){
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }else{
                JOptionPane.showMessageDialog(null, "Data gagal dimasukan");
            }
            stmt.close();
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
