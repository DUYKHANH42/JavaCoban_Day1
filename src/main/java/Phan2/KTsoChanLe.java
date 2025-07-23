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
public class KTsoChanLe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        a=sc.nextInt();
        if (a%2==0) {
           System.out.print("a la so chan."); 
        }else{
           System.out.print("a la so le."); 
        }
        
        
    }
    
}
