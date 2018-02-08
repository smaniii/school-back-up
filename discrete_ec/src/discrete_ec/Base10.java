/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discrete_ec;

import java.util.Scanner;

/**
 *
 * @author smaniii
 */
class Base10 {

    void get_data_and_print_data() {
        System.out.println("What is the number's og base");
        Scanner user_input = new Scanner( System.in );
        String og_base_string;
        og_base_string= user_input.next( );
        int og_base = Integer.parseInt(og_base_string);
        System.out.println("What number do you want to change to base 10");
        String og_number_string;
        og_number_string= user_input.next( );
        int og_number = Integer.parseInt(og_number_string);
        run(og_base, og_number);
    }

    void run(int og_base, int og_number) {
        
        String temp = Integer.toString(og_number);
        temp = new StringBuilder(temp).reverse().toString();
        int[] intArr = new int[temp.length()];
        int i;
        for (i = 0; i < temp.length(); i++) {
            intArr[i] = temp.charAt(i) - '0';
            //System.out.println(intArr[i]);
        }
        int total_num = 0;
        for (i = 0; i<temp.length();i++) {
            total_num = total_num + (int) (intArr[i] * Math.pow(og_base,i));
        }
        System.out.println("The value is base 10 is " + total_num);
        
    }
    
}
