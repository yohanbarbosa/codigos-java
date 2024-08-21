import java.util.*;

public class vector {
   public static Scanner valor = new Scanner(System.in);
      public static void main(String[]args){
        System.out.println("ingrese el tamaño del vector");
        int n = valor.nextInt();
       int pp[]= new int[n];
        // System.out.println("tamaño del vector es");
        // System.out.println(pp.length);
         datos_vector(pp);
        // for(int i=0; i < pp.length;i++){
        // System.out.println("datos de la posicion " + i + "   " + pp[i]);
        // }
        // int suma = datos_vector(pp);
        // System.out.println("suma de los vectores "+ suma);
    }
    
    public static void datos_vector(int pp[]){
        int sum=0;
        for(int i=0; i < pp.length;i++){
            System.out.println("ingrese el valor de la posicion " + i );
            pp[i]=valor.nextInt();
            sum +=pp[i];
        }
        

    }

//   public static int imprimir(int pp[]){

//   }
  

}