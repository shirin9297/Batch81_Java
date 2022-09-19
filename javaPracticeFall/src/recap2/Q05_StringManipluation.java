package recap2;

import java.util.Scanner;

public class Q05_StringManipluation {
  public static void main(String[] args) {

    // Kullanicidan ismini ve soyismini girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    Scanner scan=new Scanner(System.in);
    System.out.println("lutfen isminizi ve soy isminizi giriniz");
    String firstname = scan.nextLine(), lastName = scan.nextLine(); // multiple declaration

    String fullName = firstname.concat(" " + lastName).toUpperCase();
    System.out.println("fullName = " + fullName);
  }
}
