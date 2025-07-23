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
public class TinhTong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print(" Vui lòng nhập n: ");
        int n = sc.nextInt();
        int tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        System.out.println("Tổng từ 1 đến " + n + "=: " + tong);

    }
}
