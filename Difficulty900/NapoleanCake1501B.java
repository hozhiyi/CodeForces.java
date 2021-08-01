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
public class NapoleanCake1501B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int c = a[n - 1];
            StringBuilder sb = new StringBuilder();
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] >= c) {
                    c = a[i];
                }
                if (c > 0 && c >= a[i]) {
                    sb.append("1 ");
                    c--;
                } else {
                    sb.append("0 ");
                }
            }
            System.out.println(sb.reverse().toString().trim());
        }
    }
}
