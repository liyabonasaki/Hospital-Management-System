/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Liyabona Saki
 */
public class BubbleSorting {
    
    public static void sort(int [] array){
        
        int len = array.length;
        int temp;
        
        for (int i = 0; i < len -1; i++) {
            
            for (int j = 0; j < len - i - 1; j++) {
                
                //Swapping Adjacent
                if (array[j] > array[j + 1]){
                    
                   temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
                    
                }
                
            }
            
        }
        
    }
    
}
