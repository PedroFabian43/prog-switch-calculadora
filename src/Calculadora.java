import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args){

        final String OPER_SUMA = "+";

        final String PETICION_NUM1 = "Dime un número: ";
        final String PETICION_NUM2 = "Dime otro número: ";
        final String PETICION_OPERACION = "Que operación quieres hacer: ";

        int num1;
        int num2;
        String operacionUsuario;

        Operador operacion;

        Scanner sc = new Scanner(System.in);

        num1 = Integer.valueOf(sc.nextLine());
        num2 = Integer.valueOf(sc.nextLine());
        operacionUsuario = sc.nextLine();

        if(operacionUsuario.equals(OPER_SUMA)){
            operacion = Operador.SUMA;
        }

        //[....]

        /*switch (operacion) {
            case SUMA:
                
                break;
        
            default:
                break;
        }*/

    }
}
