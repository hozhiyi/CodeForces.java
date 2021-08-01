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
public class MultiplicationTable577A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt();
        int counter = 0;

        for (int i = 1; i <= size; i++) {
            if (num % i == 0 && num / i <= size) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
