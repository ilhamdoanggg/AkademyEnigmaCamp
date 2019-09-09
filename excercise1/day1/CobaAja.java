
public class CobaAja {
     // static int a = 1000;
     public static void main(String[] args){

          int a=3;
          int b=4;
          int c=0;

          c=b;
          b=a;
          a=c;

          System.out.println(a);
          System.out.println(b);
          System.out.println(c);
          getName("asdasd");
          getKolom("nama");
     }
     public static void getName(String nama)
     {
          //int x = sum (5, 4);
          //System.out.println(x);
          //String nama = "Firman Agam";
          System.out.println(nama);
     }
//     static int sum (int a, int b)
//     {
//          return a+b;
//     }

     public static void getKolom(String kolom){
          System.out.println(kolom);
     }
}
