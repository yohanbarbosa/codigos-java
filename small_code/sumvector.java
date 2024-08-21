import java.util.*;

public class sumvector {
    public static  Scanner valor = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese la dimensión del primer vector");
        int dimension = valor.nextInt();
        int vector1[] = new int[dimension];
        DatosVector(vector1);       

        System.out.println("ingrese la dimension del segundo vector ");
        dimension = valor.nextInt();
         int vector2[] = new int [dimension];
        DatosVector(vector2);       
        
        int resultado[] =sumarVectores(vector1, vector2);
        System.out.println("################### resultado de la suma de los vectores ######################");
        System.out.println(" " );
        imprimir_Vector(resultado);
    }

    public static void DatosVector(int vector[]) {

        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese el dato de la poscision " + i);
            vector[i] = valor.nextInt();
        }
        
    }

    public static void imprimir_Vector(int im_vector[]){
        for( int i = 0; i < im_vector.length ; i++){
            System.out.println("suma de la posicion " + i );
            System.out.println(im_vector[i]);
        }
    }
    public static int[] sumarVectores(int vector1[], int vector2[]) {
        int resultado[] = new int[Math.max(vector1.length, vector2.length)];

        for (int i = 0; i < resultado.length; i++) {
            int valorVector1 = (i < vector1.length) ? vector1[i] : 0;
            int valorVector2 = (i < vector2.length) ? vector2[i] : 0;
            resultado[i] = valorVector1 + valorVector2;
        }

        return resultado;
    }    

}
