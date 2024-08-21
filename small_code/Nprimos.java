import java.util.*;
public class Nprimos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int numero=sc.nextInt();
        int i;
        for(i=1; i<=numero; i++){
            int div=numero%i;
           
           if(div==0){
            System.out.println("es primo "+i);
        }else{
            System.out.println("no es primo "+i);
        }
        }
    }
    
}
