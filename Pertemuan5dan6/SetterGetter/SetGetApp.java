/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5dan6.SetterGetter;

/**
 *
 * @author asus
 */
public class SetGetApp {
        public static void main(String[] args) {
        SetGet customer = new SetGet();
        customer.SetNama("Sri Handayani");
        customer.SetNo_Pelanggan("32102660605");
        
        System.out.println("Nama pelanggan : "+customer.GetNama());
        System.out.println("Nomor Pelanggan : "+customer.GetNo_Pelanggan());
    }
}
