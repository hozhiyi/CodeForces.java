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
public class Q96A_Football {

    public static void main(String args[]) {
        
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        if (s.contains("1111111") || s.contains("0000000")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
