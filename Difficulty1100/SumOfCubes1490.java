/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty1100;

import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class SumOfCubes1490 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long a = 1;
            long b = 1;

            if (x >= 2) {

            } else {
                System.out.println("NO");
            }
        }
    }

    static long getSum(long a, long b, long x) {
        return (long) (Math.pow(a, 3) + Math.pow(b, 3));
    }

    static boolean check(long a, long b, long x, long sum) {

        if (x == sum) {
            System.out.println("YES");
        } else if (sum < x) {
            a++;
            check(a, b, x, getSum(a, b, sum));
        }
    }
    
    static long aIncrement(long a, long b, long x, long sum) {
        check(++a, b, x, sum);
    }
    
    
}
