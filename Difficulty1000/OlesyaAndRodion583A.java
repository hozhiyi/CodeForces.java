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
public class OlesyaAndRodion583A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        if (t < 10) {
            while (n-- > 0) {
                sb.append(t);
            }
            System.out.println(sb);

        } else {
            if (n == 1) {
                System.out.println("-1");
            } else {
                while (n-- > 1) {
                    sb.append(1);
                }
                sb.append(0);
                System.out.println(sb);
            }
        }
    }

    static int count(int num) {
        int counter = 0;
        while (num != 0) {
            num /= 10;
            counter++;
        }
        return counter;
    }
}
