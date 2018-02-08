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
class Eculid {

    void get_data_and_print_data() {
        Scanner user_input = new Scanner( System.in );
        int higher = 0;
        int lower = 0;
        String higher_string;
        System.out.println("type int higher");
        higher_string = user_input.next( );
        higher = Integer.parseInt(higher_string);
        String lower_string;
        System.out.println("type int lower");
        lower_string = user_input.next( );
        lower = Integer.parseInt(lower_string);
        int value = run(higher, lower);
        System.out.println(value);
    }
    int run(int higher, int lower) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (lower == 0) {
            return higher;
        }
        int lower_temp = lower;
        lower = higher % lower;
        higher = lower_temp;
        return run(higher, lower);
    }
    
}
