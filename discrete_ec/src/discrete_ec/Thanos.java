/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discrete_ec;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author smaniii
 */
class Thanos {

    int[] run(int number[], int i, int max) {
        
        int j= 0;
        for (j = 0 ;j< number.length;j++) {
            //System.out.println(number[j]);
        }
        int i_temp = i;
        while ( (int) Math.sqrt(max) > i_temp) {
            i = i_temp+1;
            while ( max > i) {
                //System.out.println("val i_temp is " + i_temp + "val of i is " + i + "val of squart is " + Math.sqrt(max) + "val of number i is " + number[i]);
                if(number[i] % i_temp == 0 ) {
                    number[i] = 0;
                }
                i++;
            }
            i_temp++;
        }
        
        
        return number;
    }

    void get_data_and_print_data() {
       Scanner user_input = new Scanner( System.in );
        String number_string;
        System.out.println("Please enter a perfect square under 10000");
        number_string = user_input.next( );
        int max_number = Integer.parseInt(number_string);
        int[] number = new int[max_number];
        number[0] = Integer.parseInt(number_string);
        int i;
        for(i = 0; i<number[0];i++) {
            number[i] = number[0] - i;
        }
        Arrays.sort(number);
        int[] res = run(number, 2, max_number);
        for(i=0;i<res.length;i++){
         
            if (res[i] != 0 && res[i] != 1 && res[i] != max_number) {
                System.out.println("this is prime " + res[i]);
            }
        }
        
    }
    
}
