/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty800;

import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class RedAndBlueBeans1519A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long r = sc.nextLong();
            long b = sc.nextLong();
            long d = sc.nextLong();

            long small = Math.min(r, b);
            long big = Math.max(r, b);

            if (big > small * (d + 1)) {

                System.out.println("NO");

            } else {
                System.out.println("YES");
            }
        }
    }
}
