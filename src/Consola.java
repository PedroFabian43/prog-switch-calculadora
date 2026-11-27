import java.util.Scanner;

public class Consola {
    
    public static void main(String[] args){

        final String PETICION_NUM1 = "Dime un número: ";
        final String PETICION_NUM2 = "Dime otro número: ";
        final String PETICION_OPERACION = "Que operación quieres hacer: ";

        final String MSG_RESUL = "El resultado es: ";

        int num1;
        int num2;
        String operacionUsuario;

        Operacion operacion;

        Scanner sc = new Scanner(System.in);

        System.out.print(PETICION_NUM1);
        num1 = Integer.valueOf(sc.nextLine());

        System.out.print(PETICION_NUM2);
        num2 = Integer.valueOf(sc.nextLine());

        System.out.print(PETICION_OPERACION);
        operacionUsuario = sc.nextLine();

        operacion = new Operacion(num1, num2, operacionUsuario);

        System.out.println(MSG_RESUL+operacion.calcular());

        

        sc.close();
    }
}
