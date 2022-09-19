package day40_final;

public class A {

   protected String isim= "Cuneyt";
    final static String Okul= "Yildiz Koleji";

    /*
    Bir variable final olarak tanimlandiysa
    baska classlardan veya icinde oldugumuz classdan
    bu variable'a baska deger atanmasi mumkun degildir.

    Madem ki degeri degistirilemiyor
    genelde static de yaparak
    bu variable'a erisim kolaylastirilabilir
    ve genelde static final olarak belirlenen variable isimleri BUYUK HARFLE yazilir
     */

    final void finalMethod(){
        System.out.println("final methodlar override edilemez");

        /*
        bir methodu final olarak isaretlerseniz
        bu method degistirilemez demektir
        (override edilemez)
         */
    }

}
