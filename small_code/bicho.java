import java.util.*;
public class bicho {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese el numero de pp");
        int pp = dato.nextInt();
        System.out.println("ingrese el numero de kk");
        int kk = dato.nextInt();
        long factp = factorial(pp);
        System.out.println("the factor of pp is " + factp );
        long factk = factorial(kk);
        System.out.println("the factor of  kk  is: " + factk );
        long M = factp;
        long mn = factk; 
        if(M<factk){
            M = factk;
            mn = factp;
        }
        System.out.println("diferencia del factorial entre "+ pp+ " y " + kk + " es: " + (M-mn));
    }
    
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}





