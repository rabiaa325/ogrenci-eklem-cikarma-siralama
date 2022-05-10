
package ödev6;

import java.util.Scanner;
import static ödev6.sırala.bubbleSort;


public class Ödev6 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
       ogrListe bl = new ogrListe();
        int seçim = -1;
        int numara;
        int indis;
          while (seçim != 0) {
           System.out.println("1 başekle");
            System.out.println("2 sonaekle");
            System.out.println("3 arayaekle");
            System.out.println("4 sil");           
            System.out.println("5  yazır");
             System.out.println("6  sırala");
            System.out.println("0 çıkış");
            System.out.println("seçiminiz");

            seçim = scanner.nextInt();

           if (seçim == 1) {
                System.out.println("sayı:");
                numara = scanner.nextInt();
                bl.başaekle();
            } else if (seçim == 2) {
                System.out.println("sayı:");
                numara = scanner.nextInt();
                bl.sonaekle(numara);
            } else if (seçim == 3) {
                System.out.println("indis:");
                indis = scanner.nextInt();
                System.out.println("sayı:");
               numara = scanner.nextInt();
                bl.arayaekle(indis, numara);
            } else if(seçim ==4){
                bl.sil();
                
            } else if (seçim ==5 ) {
                bl.yazdir();
            }
            else if(seçim==6){
                        bl.sırala();
                        }else if(seçim==0){
              System.out.println("çıkış yaptınız");
          }else{
                System.out.println("hatalı giriş yaptınız[0-5 arasında sayı giriniz]");
            }
            bl.yazdir();
        }
           int harfler[] ={43,60,35,2,45,320,5};  
                 
               
                for(int i=0; i < harfler.length; i++){  
                        System.out.print(harfler[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(harfler); 
                 
               
                for(int i=0; i < harfler.length; i++){  
                        System.out.print(harfler[i] + " ");  
                }  
   
    }

}