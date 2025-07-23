/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Phan3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int n = sc.nextInt();
        boolean Nguyento = true;

        if (n < 2) {
            Nguyento = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    Nguyento = false;
                    break;
                }
            }
        }

        if (Nguyento) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
    }
    
    }
}
