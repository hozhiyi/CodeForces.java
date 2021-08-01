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
public class RaisingBacteria579A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String b = Integer.toBinaryString(x);
        int counter = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
