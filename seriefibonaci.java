import java.util.Scanner;

public class seriefibonaci{
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int serie = valor.nextInt();
        
        for( int i = 0 ; i <= serie ; i++){
            System.out.println(serie_fibonaci(i));
        }
        
    }

    public static int serie_fibonaci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return serie_fibonaci(n-1) + serie_fibonaci(n-2);
        }
    }
}