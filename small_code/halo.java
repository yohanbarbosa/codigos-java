import java.util.*;

public class halo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        int suma = sumarEntreNumeros(n1, n2);
        int producto = multiplicarEntreNumeros(n1, n2);
        System.out.println("La suma entre " + n1 + " y " + n2 + " es: " + suma);
        System.out.println("El producto entre " + n1 + " y " + n2 + " es: " + producto);
    }

    public static int sumarEntreNumeros(int n1, int n2) {
        int suma = 0;
        for (int i = n1; i <= n2; i++) {
            if(i%2==0){
             suma += i;
            }
           
        }
        return suma;
    }

    public static int multiplicarEntreNumeros(int n1, int n2) {
        int producto = 1;
        for (int i = n1; i <= n2; i++) {
            if(i%2==0){
                 producto *= i;
            }
           
        }
        return producto;
    }
}