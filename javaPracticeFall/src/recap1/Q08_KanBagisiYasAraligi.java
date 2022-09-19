package recap1;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {

    /*
Problem tanimi :
Kullanicidan  yasini ve kilosunu aliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();

        System.out.println("Lutfen kilonuzu giriniz : ");
        double kilo = scan.nextDouble();

      if(yas<18){
          System.out.println("kan bagisi yapamazsiniz");
      }else if(yas>18 && kilo<50){
          System.out.println("kan bagisi yapamazsiniz");
      }else if(yas>18 && kilo>=50){
          System.out.println("kan bagisi yapabilirsiniz");
      }
    }
}
