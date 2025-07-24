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
public class SapXepPhantu {

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
        for (int i = 0; i < Mang.length - 1; i++) {
            for (int j = i + 1; j < Mang.length; j++) {
                if (Mang[i] > Mang[j]) {
                    int temp = Mang[i];
                    Mang[i] = Mang[j];
                    Mang[j] = temp;
                }
            }
        }
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < Mang.length; i++) {
            System.out.print(Mang[i] + " ");
        }

    }

}
