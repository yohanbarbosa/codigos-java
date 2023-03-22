import java.util.*;
public class factor {
    public static void main(String args[]){
        Scanner valor = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int x=valor.nextInt();
        System.out.println("ingrese el factor");
        int y =valor.nextInt();
        int t=x; int rta;
        for(int i=1; i<y ; i++){
             rta=x*t;
             x=rta;    
        }
        System.out.println(x);

    }

}