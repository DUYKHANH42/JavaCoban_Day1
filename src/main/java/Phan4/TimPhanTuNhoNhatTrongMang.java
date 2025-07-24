/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Phan4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TimPhanTuNhoNhatTrongMang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Mang = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Mang.length; i++) {
            System.out.print("Nhập giá trị phần tử thứ " + (i + 1) + ": ");
            Mang[i] = sc.nextInt();
        }
        for (int i = 0; i < Mang.length; i++) {
            System.out.println("Phan tu thu " + i + " co gia tri= " + Mang[i]);
        }
        int min = Mang[0], max = Mang[0];
        for (int i = 1; i < Mang.length; i++) {
            if (Mang[i] > max) {
                max = Mang[i];
            }
            if (Mang[i] < min) {
                min = Mang[i];
            }
        }
        System.out.println("So lon nhat la: " + max);
        System.out.println("So nho nhat la: " + min);

    }
}
