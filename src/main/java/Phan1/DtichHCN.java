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
public class DtichHCN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here int a,b,tong;
        int dai,rong,dt;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai=sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        rong=sc.nextInt();
        dt=dai *rong;
        System.out.println("Dien tich hinh chu nhat " + dai + " * " + rong + " = " + dt);
    }
    
}
