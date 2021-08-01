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
public class TheCakeIsALie1519B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int x = 1;
            int y = 1;

            int cost = 0;

            while (n > x) {
                x++;
                cost += y;
            }
            while (m > y) {
                y++;
                cost += x;
            }
            if (cost == k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
