
package ödev6;

/**
 *
 * @author Rabia OK
 */
public class sırala {
    static void bubbleSort(int[] harfler) {  
        int n = harfler.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(harfler[j-1] > harfler[j]){  
                                 temp = harfler[j-1];  
                                 harfler[j-1] = harfler[j];  
                                 harfler[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
}
