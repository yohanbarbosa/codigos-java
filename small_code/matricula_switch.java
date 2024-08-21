import java.util.*;
public class matricula_switch{
    public static void main(String[] args) {
        
    System.out.println("cod____________tipo de matricula");
    System.out.println("  1_______________programa tecnico");
    System.out.println("  2_______________programa tecnologico");
    System.out.println("  3_______________programa profecional");
    System.out.println("  4_______________programa de especializacion");
    System.out.println("  5_______________programa de maestria");
    System.out.println("  6_______________programa de doctorado");
    Scanner valor = new Scanner(System.in);
    double total; int codigo;

        System.out.println("ingrese el codigo del programa");
       codigo=valor.nextInt();
    
     switch (codigo) {
            case 1:
            total=(1160000*0.5)+150000;
            System.out.println("total a pagar por matricula "+total);
            break;
            case 2:
            total=(1160000*0.7)+200000;
            System.out.println("total a pagar por matricula "+total);
            break;
            case 3:
            total=(1160000)+250000;
            System.out.println("total a pagar por matricula "+total);
            break;
            case 4:
            total=(1160000*2.5)+150000;
            System.out.println("total a pagar por matricula "+total);
            break;
            case 5:
            total=(1160000*3.5)+150000;
            System.out.println("total a pagar por matricula "+total);
            break;
            case 6:
            total=(1160000*8)+150000;
            System.out.println("total a pagar por matricula "+total);
            break;
        default:
        System.out.println("solo puede ingresar numeros validos");
      
    }

    

    }
    
  }
    
