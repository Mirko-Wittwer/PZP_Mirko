public class Main {

    public static void main(String[] args) {

       System.out.println(addiere(20, 10));
       System.out.println(subtrahiere(20, 10));
       System.out.println(multipliziere(20, 10));
       System.out.println(dividiere(20, 10));
       System.out.println(modulo(20, 10));
   }

   static double addiere (double a, double b){
         return a+b;
   }

   static double subtrahiere (double a, double b){
         return a-b;
   }

   static double multipliziere (double a, double b){
         return a*b;
   }

   static double dividiere (double a, double b){
         return a/b;
   }

   static double modulo (double a, double b){
         return a % b;
   }



}
