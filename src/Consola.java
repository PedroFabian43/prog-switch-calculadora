import java.util.Scanner;

public class Consola {
    
    public static void main(String[] args){

        final String OPER_SUMA = "+";
        final String OPER_RESTA = "-";
        final String OPER_MULTI = "*";

        final String PETICION_NUM1 = "Dime un número: ";
        final String PETICION_NUM2 = "Dime otro número: ";
        final String PETICION_OPERACION = "Que operación quieres hacer: ";

        final String MSG_RESUL = "El resultado es: ";

        int num1;
        int num2;
        int resultado = 0;
        String operacionUsuario;

        Operador operacion;

        Scanner sc = new Scanner(System.in);

        System.out.print(PETICION_NUM1);
        num1 = Integer.valueOf(sc.nextLine());

        System.out.print(PETICION_NUM2);
        num2 = Integer.valueOf(sc.nextLine());

        System.out.print(PETICION_OPERACION);
        operacionUsuario = sc.nextLine();

        if(operacionUsuario.equals(OPER_SUMA)){
            operacion = Operador.SUMA;
        }
        else if(operacionUsuario.equals(OPER_RESTA)){
            operacion = Operador.RESTA;
        }
        else if(operacionUsuario.equals(OPER_MULTI)){
            operacion = Operador.MULTIPLICACION;
        }
        else{
            operacion = Operador.DIVISION;
        }


        switch(operacion){
            
            case SUMA -> resultado = num1 + num2;

            case RESTA -> resultado = num1 - num2;

            case MULTIPLICACION -> resultado = num1 * num2;

            case DIVISION -> resultado = num1 / num2;
        }

        System.out.println(MSG_RESUL+resultado);

        sc.close();
    }
}
