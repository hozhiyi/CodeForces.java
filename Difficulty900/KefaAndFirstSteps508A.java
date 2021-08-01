/* 4 MAY 2021
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty900;

import java.util.Scanner;

public class KefaAndFirstSteps508A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        int[] numberArr = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            numberArr[i] = input.nextInt();
        }
        int max = 1;
        int counter = 1;
        for (int i = 1; i < quantity; i++) {
            if (numberArr[i - 1] <= numberArr[i]) {
                ++counter;
                if (counter > max) {
                    max = counter;
                }
            } else {
                counter = 1;
            }
        }
        System.out.println(max);
    }
}
