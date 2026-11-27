import java.util.Scanner;

public class Consola {
    
    public static void main(String[] args){

        final int OPT1 = 1;
        final int OPT2 = 2;
        final int OPT3 = 3;

        final String PETICION_NUM1 = "Dime un número: ";
        final String PETICION_NUM2 = "Dime otro número: ";
        final String PETICION_OPERACION = "Que operación quieres hacer: ";

        final String MENU = """
                            === MENÚ CALCULADORA ===
                            ¿Qué deseas hacer?
                            1. Sumar
                            2. Restar
                            3. Multiplicar
                            4. Dividir
                            ========================
                            Opción: """;

        final String MSG_RESUL = "El resultado es: ";

        int num1;
        int num2;
        String operacionUsuario;
        int opcion;

        Operacion operacion;
        Operacion operacion2;

        Operador oper;

        Scanner sc = new Scanner(System.in);

        System.out.print(PETICION_NUM1);
        num1 = Integer.valueOf(sc.nextLine());

        System.out.print(PETICION_NUM2);
        num2 = Integer.valueOf(sc.nextLine());

        System.out.print(PETICION_OPERACION);
        operacionUsuario = sc.nextLine();

        operacion = new Operacion(num1, num2, operacionUsuario);

        System.out.println(MSG_RESUL + operacion.calcular());

        System.out.print(MENU);
        opcion = Integer.valueOf(sc.nextLine());

        if (opcion == OPT1) {
            oper = Operador.SUMA;
        }
        else if(opcion == OPT2){
            oper = Operador.RESTA;
        }
        else if(opcion == OPT3){
            oper = Operador.MULTIPLICACION;
        }
        else{
            oper = Operador.DIVISION;
        }

        operacion2 = new Operacion(num1, num2, oper);
        System.out.println(MSG_RESUL + operacion2.calcular());

        sc.close();
    }
}
