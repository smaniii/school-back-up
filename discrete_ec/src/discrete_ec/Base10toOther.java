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
class Base10toOther {

    void get_data_and_print_data() {
        System.out.println("What is the new number's base");
        Scanner user_input = new Scanner( System.in );
        String new_base_string;
        new_base_string= user_input.next( );
        int new_base = Integer.parseInt(new_base_string);
        System.out.println("What number do you want to change out of base 10");
        String old_number_string;
        old_number_string= user_input.next( );
        int old_number = Integer.parseInt(old_number_string);
        run(new_base, old_number);
    }

    void run(int new_base, int old_number) {
        int[] remainder = new int[10000];
        int remains = 1;
        int i = 0;
        while (old_number != 0) {
            remains = old_number % new_base;
            old_number = old_number / new_base;
            System.out.println(remains + " " + old_number);
            //System.out.println(remains);
            remainder[i] = remains;
            i++;
        }
        int[] remainder_new = new int[i+1];
        int[] final_remainder = new int[i+1];
        int i_new = i;
        for(i = 0 ;i<=i_new;i++) {
            remainder_new[i] = remainder[i];
            
        } 
        System.out.print("the value of the number in base " + new_base + " is ");
        for (i = 0; i<i_new; i++) {
            final_remainder[i_new-i] = remainder_new[i];
        }
        for(i = 1; i<remainder_new.length;i++) {
           
                System.out.print(final_remainder[i]);
            
        }
        System.out.println(" ");

    }
    
}
