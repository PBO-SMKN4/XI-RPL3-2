/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hesco;

import Hesco.Views.v_Login;

/**
 *
 * @author ASUS X455L
 */
public class MainHesco {
    public static WargaSekolah pasien = new Pasien();
    public static WargaSekolah petugas = new Petugas();
    public static Obat obat = new Obat();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        v_Login vlog = new v_Login();
        vlog.setVisible(true);
    }
    
}
