/**
 * Algorithm
 * Accept String as input
 * Will need to manipulate the string to insert and remove char
 * Thus, turn String into sb
 * Loop thru sb
 *      if current char isVowel
 *          remove it
 *      else
 *          set current char as its lower case version
 *          add '.' in front of current char
 * 
 * isVowel method:
 * receive a char c
 * have a char[] for all vowels A O Y E U I
 * loop thru char[]
 *      if char[i] == c
 *          return true
 * return false as default
 */
package Difficulty1000;

import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class StringTask118A {

    public static void main(String[] args) {

        // using scanner class bcus i dunno how to use bf yet
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // yay sb instead of string
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length();) {

            // to upper case for comparing
            if (isVowel(Character.toUpperCase(sb.charAt(i)))) {
                sb.deleteCharAt(i);
            } else {
                
                // to lower case to fulfil output requirements
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
                sb.insert(i, '.');
                i += 2;
            }
        }
        System.out.println(sb.toString());

    }

    static boolean isVowel(char c) {
        char[] vowelArr = {'A', 'O', 'Y', 'E', 'U', 'I'};
        for (int i = 0; i < vowelArr.length; i++) {
            if (c == vowelArr[i]) {
                return true;
            }
        }
        return false;
    }
}
