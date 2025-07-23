/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Phan1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SoNguyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,tong;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        a=sc.nextInt();
        System.out.print("Nhap so nguyen b: ");
        b=sc.nextInt();
        tong=a + b;
        System.out.println("So nguyen a + b= "+tong); 
    }
    
}
