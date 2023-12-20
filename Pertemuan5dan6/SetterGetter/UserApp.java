/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5dan6.SetterGetter;

/**
 *
 * @author asus
 */
public class UserApp {
    
        public static void main(String[] args) {
        User user = new User();
        user.SetUsername("Sri Handayani");
        user.Setpassword("Rahasia");
        
        System.out.println("Usernamenya = "+user.GetUsername());
        System.out.println("Passowrdnya = "+user.GetPassword());
    }
}
