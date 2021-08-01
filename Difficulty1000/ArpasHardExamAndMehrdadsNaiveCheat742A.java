/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty1000;

import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class ArpasHardExamAndMehrdadsNaiveCheat742A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("1");
        } else if (n % 4 == 1) {
            System.out.println("8");
        } else if (n % 4 == 2) {
            System.out.println("4");
        } else if (n % 4 == 3) {
            System.out.println("2");
        } else if (n % 4 == 0) {
            System.out.println("6");
        }
    }
}
