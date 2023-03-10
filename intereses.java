import java.util.Scanner;
public class intereses{
public static void main(String[] args){
    float dinero,total;
    int mes;
    Scanner valor=new Scanner(System.in);
    do{
    System.out.println("ingrese la cantidad de dinero");
    dinero=valor.nextFloat();}while(dinero<0);
    
    System.out.println("ingrese la cantidad de meses ");
    mes=valor.nextInt();

    if(dinero<=100000){
        System.out.println("su interes sera del 1.5%");
        total=(float)((dinero*1.5)/100);
        System.out.println (total);

    } else if(dinero>100000 & dinero<=1000000){
        System.out.println("su interes sera del 2%");
        total=(float)(((dinero*2)/100)*mes)+dinero;
        System.out.println("total "+total);

    }else if(dinero>1000000 & dinero<=2000000){
        System.out.println("su interes sera del 3%");
        total=(float)(((dinero*3)/100)*mes)+dinero;
            System.out.println("total "+total);

    }else if(dinero>2000000 & dinero<=4000000){
        System.out.println("su interes sera del 5%");
        total=(float)(((dinero*5)/100)*mes)+dinero;
        System.out.println("total "+total);

    }else if(dinero>4000000){
        System.out.println("su interes sera del 6%");
        total=(float)(((dinero*6)/100)*mes)+dinero;
        System.out.println("total "+total);
    }

}
}