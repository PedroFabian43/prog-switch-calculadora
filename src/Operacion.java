public class Operacion {

    public static final String OPER_SUMA = "+";
    public static final String OPER_RESTA = "-";
    public static final String OPER_MULTI = "*";




    private int num1;
    private int num2;
    private Operador operacion;

    public Operacion(int num1, int num2, Operador operacion){
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;   
    }

    public Operacion(int num1, int num2, String operacion){
        this.num1 = num1;
        this.num2 = num2;

        if(operacion.equals(OPER_SUMA)){
            this.operacion = Operador.SUMA;
        }
        else if(operacion.equals(OPER_RESTA)){
            this.operacion = Operador.RESTA;
        }
        else if(operacion.equals(OPER_MULTI)){
            this.operacion = Operador.MULTIPLICACION;
        }
        else{
            this.operacion = Operador.DIVISION;
        }
    }

    public int calcular(){

        int resultado = 0;
    
        switch(operacion){
            
            case SUMA -> resultado = num1 + num2;

            case RESTA -> resultado = num1 - num2;

            case MULTIPLICACION -> resultado = num1 * num2;

            case DIVISION -> resultado = num1 / num2;
        }

        return resultado;
    }
}
