import java.util.*;
public class DF {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese el numero de pp");
        int pp = dato.nextInt();
        System.out.println("ingrese el numero de kk");
        int kk = dato.nextInt();
        long factp = factorial(pp);
        System.out.println("factorial de " + pp + " es: " + factp );
        long factk = factorial(kk);
        System.out.println("factorial de "+ kk + " es: "  + factk );
        long diferencia = diferenciaFactoriales(pp,kk);
        System.out.println("diferencia del factorial entre "+ pp+ " y " + kk + " es: " + diferencia);
    }
    
    // Método recursivo que calcula el factorial de números enteros solamente  positivos
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static long diferenciaFactoriales(int pp, int kk) {
        if (pp < 0 || kk < 0) {
            return -1; // error: no se permiten números negativos
        } else if (pp == 0 || kk == 0) {
            return -1; // error: no se permiten ceros
        } else {
            long factpp = factorial(pp);
            long factkk = factorial(kk);
            return Math.abs(factpp - factkk); // devolver la diferencia absoluta entre los factoriales
        }
    }
}





