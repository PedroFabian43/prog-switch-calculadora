public class Calculadora {
    
    private int num1;
    private int num2;
    private Operador operacion;

    public Calculadora(int num1, int num2, Operador operacion){
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;   
    }

    public Calculadora(int num1, int num2, String operacion){
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }

    public int calcular(){
        switch(operacion){
            
            case SUMA -> num1 + num2;

            case RESTA -> resultado = num1 - num2;

            case MULTIPLICACION -> resultado = num1 * num2;

            case DIVISION -> resultado = num1 / num2;
        }

        return resultado;
    }
}
