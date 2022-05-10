
package ödev6;



import java.util.Scanner;

public class ogrListe {

    ogrNode head = null;
    ogrNode tail = null;
    ogrNode temp = null;
    ogrNode temp2 = null;
    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ort;
    String durum;
    String harfler,sonuc = null;
    Scanner scanner = new Scanner(System.in);
       
    void başaekle() {
        System.out.println("bilgisyar bölümünü sınav sonucları listesi");
        System.out.println("numara");
        numara = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ad");
        ad = scanner.nextLine();
        System.out.println("soyad");
        soyad = scanner.nextLine();
        System.out.println("vize");
        vize = scanner.nextInt();
        System.out.println("final");
        fin = scanner.nextInt();
//iki boyutlu ekleme
        ogrNode eleman = new ogrNode(numara, ad, soyad, vize, fin);
        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("bilgisyar bölümüne sınav notu listesi oluşturuldu");
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            System.out.println(numara + "numaralı öğrenci sınav notu oluşturuldu");//başa eklemeli
        }
    }
    void arayaekle(int indis, int data) {//fonksiyonu çağıran datayı koymalı
        ogrNode eleman = new ogrNode(numara, ad, soyad, vize, fin);
        if (head == null) {
            head = eleman;
            tail = eleman;

        } else if (head != null && indis == 0) {
            eleman.next = head;//başına eklemek isteyebilir
            head.prev = eleman;
            head = eleman;
        } else {
            //eleman sayısını saydırmalıyım
            int n = 0;
            ogrNode temp = head;
            while (temp != null) {
                temp = temp.next;//amaç listede kaç adet düğüm (nesne)var
                n++;
            }
            temp = head;
            if (indis > n) {//eklemek istediğim son indis olabilir--------------- n-1 tail demek
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
            } else {//araya ekliyosun
                int i = 0;
                while (i != indis) {
                    temp = temp.next;
                    i++;//yerleştireceği yeri buldu
                }
                eleman.prev = temp.prev;
                temp.prev.next = eleman;
                eleman.next = temp;
                temp.prev = eleman;

            }
        }
    }
   
      void sonaekle(int data) {//fonksiyonu çağıran datayı koymalı
        ogrNode eleman = new ogrNode(numara, ad, soyad, vize, fin);
        if (head == null) {
            head = eleman;
            tail = eleman;

        } else {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }


    void sil() {
        if (head == null) {
            System.out.println("silinecek öğrenci yok");
        } else {
            System.out.println("bçlümden silmek istediğiğniz öğrencinin numarasını giriniz:");
            numara = scanner.nextInt();
            //headı silebilir önemli
            if (numara == head.numara && head.next == null) {//tek eleman var demek oluyo
                head = null;
                tail = null;
                System.out.println("numaralı öğr silindi listede eleman kalmadı");
            } else if (numara == head.numara && head.next != null) {
                head = head.next;//headi bir sonraki düğüme aktardık
                System.out.println(numara + "numaralı öğrenci silindi");
            } else {
                temp = head;
                temp2 = head;
                while (temp.next != null) {
                    if (numara == temp.numara) {
                        temp2.next = temp.next;
                        System.out.println(numara + "numaralı öğrenci silindi");
                    }
                    temp2 = temp;//temp2 ve temp peşpeşe olan düğümler silmek istenilen temp
                    temp = temp.next;
                    if (numara == temp.numara) {
                        temp2.next = null;//aslında burda tail silindi(son düğüm silindi)
                        tail = temp2;
                        System.out.println(numara + "numaralı öğrenci silindi");
                    }
                }
            }
        }
    }

    void yazdir() {
        if (head == null) {
            System.out.println("liste boş!!!");
        } else {
            temp = head;
            while (temp != null) {
                System.out.println(temp.numara + "numaralı öğrenci bilgileri");
                System.out.println("***************************");
                System.out.println("ad   :" + temp.ad);
                System.out.println("soyad   :" + temp.soyad);
                System.out.println("vize   :" + temp.vize);
                System.out.println("final   :" + temp.fin);
                System.out.println("ortalama   :" + temp.ort);
                System.out.println("durum   :" + temp.durum);
                System.out.println("***************************");

                temp = temp.next;

            }
        }
    }
    void sırala(int A[]){
       int temp;
       
       for(int ort=0;ort<A.length;ort++){
           for(int j=1;j<A.length-ort+1;j++){
               {
                  if(A[j-1]>A[j]){  
                    temp=A[j-1] ;
                    A[j-1]=A[j];
                    A[j]=temp;
               }

           }
          
               
           }
       }
    }
    

    void enbaşarılıöğrenci() {
        if (head == null) {
            System.out.println("liste boş!!!");
        } else {
            temp = head;
            double büyük = temp.ort;

            while (temp != null) {
                if (büyük < temp.ort) {

                    büyük = temp.ort;
                    numara = temp.numara;
                    ad = temp.ad;
                    soyad = temp.soyad;
                    vize = temp.vize;
                    fin = temp.fin;
                    ort = temp.ort;
                    durum = temp.durum;
                    
                }
                temp = temp.next;
                System.out.println("ortalaması en yüksek  öğrenci bilgileri");
                System.out.println("***************************");
                System.out.println("ad   :" + temp.ad);
                System.out.println("soyad   :" + temp.soyad);
                System.out.println("vize   :" + temp.vize);
                System.out.println("final   :" + temp.fin);
                System.out.println("ortalama   :" + temp.ort);
                System.out.println("durum   :" + temp.durum);
                System.out.println("Harf Olarak Notunuz;" + harfler);
                System.out.println("***************************");
            }

        }
    }

    void sırala() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
