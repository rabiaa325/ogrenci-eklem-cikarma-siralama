
package ödev6;

/**
 *
 * @author RABİA OK
 */
public class ogrNode {

    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    String right;
    int c,d;
    String key;
    String max;
        String left;
    double ort;
    String durum;
    ogrNode next;
    ogrNode prev;

    public ogrNode(int numara, String ad, String soyad, int vize, int fin) {
        // super(); kalıtım almadık
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.fin = fin;
       String harfler,sonuc = null;
        ort = vize * 0.4 + fin * 0.6;
        if (ort >= 50) {
            durum = "gecti";

        } else {
            durum = "kaldı";
            next = null;
        }
        if ((vize > 100) || (fin > 100) ) {
            System.out.println("Hatalı not girişi yaptınız.");

        } else {

            if (ort < 55) {
                sonuc = "Dersi Geçemediniz";
            } else if (ort >= 55) {
                sonuc = "Dersi Geçtiniz Tebrikler";
            }
            if (ort > 94) {
                harfler = "AA";
            } else if ((ort > 85) && (ort <= 94)) {
                harfler = "BA";
            } else if ((ort > 80) && (ort <= 85)) {
                harfler = "BB";
            } else if ((ort > 70) && (ort <= 80)) {
                harfler = "CB";
            } else if ((ort > 65) && (ort <= 70)) {
                harfler = "CC";
            } else if ((ort > 59) && (ort <= 65)) {
                harfler = "DD";
            } else if ((ort > 49) && (ort <= 59)) {
                harfler = "DC";
            } else if ((ort > 39) && (ort <= 49)) {
                harfler = "FD";
            } else {
                harfler = "FF,Üzgünüz Kaldınız.";
            }
            System.out.println("Ortalamanız;" + ort);
            System.out.println("Harf Olarak Notunuz;" + harfler);
            System.out.println("Harf Olarak Notunuz;" + sonuc);
        }

    }

}
    
