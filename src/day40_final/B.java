package day40_final;

final public class B extends A {

    public static void main(String[] args) {

       B obj=new B();
       obj.isim="Alp";

        System.out.println(A.Okul);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        /*
        bir class final olarak belirlenirse,
        o class inherit edilemez
         */
    }
}
