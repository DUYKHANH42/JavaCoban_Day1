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
public class GiaiPTBacNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here int a,b,tong;
        int a,b;
        double x;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a=sc.nextInt();
        System.out.print("Nhap he so b: ");
        b=sc.nextInt();
        if (a==0) {
            if (b==0) {
                 System.out.println("Phuong trinh co vo so nghiem");
            }
            else{
                 System.out.println("Phuong trinh vo nghiem");
            }
        }
         else {
             x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }
    
}
