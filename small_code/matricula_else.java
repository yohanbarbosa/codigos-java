import java.util.*;
public class matricula_else{
     /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("codigo__________programa");
        System.out.println("  1_____________programa tecnico");
        System.out.println("  2_____________programa tecnologico");
        System.out.println("  3_____________programa profecional");
        System.out.println("  4_____________programa de especializacion");
        System.out.println("  5_____________programa de maestria");
        System.out.println("  6_____________programa de doctorado");
        Scanner valor =new Scanner(System.in);
        int c; double total;
        do{
            System.out.println("ingrese el codigo del programa");
        c=valor.nextInt();}while(c>=7);
        
        if(c==1){
            total=(1160000*0.5)+150000;
            System.out.println("total a pagar"+total);
        }else if(c==2){
            total=((1160000*0.7)+200000);
            System.out.println("total a pagar por matricula "+total);
        }else if(c==3){
            total=(1160000)+250000;
            System.out.println("total a pagar por matricula "+total);
        }else if(c==4){
            total=(1160000*2.5)+150000;
            System.out.println("total a pagar por matricula "+total);
        }else if(c==5){
            total=(1160000*3.5)+150000;
            System.out.println("total a pagar por matricula "+total);
            
        }else if(c==6){
            total=(1160000*8)+150000;
            System.out.println("total a pagar por matricula "+total);
        }
    }
        
    
}
