/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty900;

import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class EatingSoup1163A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m > n / 2) {
            System.out.println(n - m);
        } else if (m == 0) {
            System.out.println("1");
        } else if (m == n) {
            System.out.println("0");
        } else {
            System.out.println(m);
        }
    }
}
