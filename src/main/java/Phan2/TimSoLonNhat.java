/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Phan2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TimSoLonNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        a=sc.nextInt();
         System.out.print("Nhap so nguyen b: ");
        b=sc.nextInt();
         System.out.print("Nhap so nguyen c: ");
        c=sc.nextInt();
        int max=a;
        if(b>max){
        max=b;
        }
        if (c>max){
          max=c;
        }
       System.out.println("So lon nhat la: " + max); 
    }
}
