/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class Q160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> value = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            value.add(sc.nextInt());
            sum += value.get(i);
        }
        //Arrays.sort(value);
    }
}
