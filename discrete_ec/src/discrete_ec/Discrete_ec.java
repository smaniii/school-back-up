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
public class Discrete_ec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter what therom you want to test");
        System.out.println("0 is eculid");
        System.out.println("1 is eratosthenes");
        System.out.println("2 is other base to base 10 ");
        System.out.println("3 is base 10 to other ");
        System.out.println("4 is inverse mod ");
        
        Scanner user_input = new Scanner( System.in );
        String what_to_run_string;
        what_to_run_string = user_input.next( );
        int what_to_run = Integer.parseInt(what_to_run_string);
        
        if (what_to_run == 0) {
            Eculid eculid = new Eculid();
            eculid.get_data_and_print_data();
        }
        else if (what_to_run == 1) {
            Thanos thanos = new Thanos();
            thanos.get_data_and_print_data();
        }
        else if (what_to_run == 2) {
            Base10 base10 = new Base10();
            base10.get_data_and_print_data();
        }
        else if (what_to_run == 3) {
            Base10toOther Base10toOther = new Base10toOther();
            Base10toOther.get_data_and_print_data();
        }
        else if (what_to_run == 4) {
            Inversemod inversemod = new Inversemod();
            inversemod.get_data_and_print_data();
        }


    }
    
}
