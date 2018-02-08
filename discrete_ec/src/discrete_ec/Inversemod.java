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
class Inversemod {

    void get_data_and_print_data() {
        Scanner user_input = new Scanner( System.in );
        System.out.println("A = (1/B) mod C");
        String b;
        int b_num;
        System.out.println("Please enter B");
        b = user_input.next( );
        b_num = Integer.parseInt(b);
        int c_num;
        String c;
        System.out.println("Please enter C");
        c = user_input.next( );
        c_num = Integer.parseInt(c);
        
        int a = run(b_num, c_num);
        if (a < 10000) {
            System.out.println("The mod inverse is " + (a-1));
        }
        else {
            System.out.println("There is not mod incerse under 10000 for this problem.");
        }
    }

    int run(int b_num, int c_num) {
        int i = 0;
        int j = 0;
        int k;
        while(j != 1 && i <= 10000) {
            k = b_num * i;
            //System.out.println(k);
            j = k % c_num;
            //System.out.println(j);
            i++;
            //System.out.println(i);
        }
        
        
        return i;
    }
    
}
