import java.util.Scanner;

/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Calculadora
{
    // instance variables - replace the example below with your own
    private double num1;
    private double num2;
    private double rdo;
    private Operacion op;

    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer operando: ");
        calculadora.ponNum1(scanner.nextDouble());
        System.out.println("Introduce el segundo operando: ");
        calculadora.ponNum2(scanner.nextDouble());
        try {
            System.out.println("Introduce la operación: ");
            calculadora.ponOperacion(scanner.next());
            calculadora.opera();
            System.out.println("Resultado: " + calculadora.dameResultado());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public void ponNum1(double n1)
    {
        // put your code here
        this.num1=n1;
    }
    
    public void ponNum2(double n2)
    {
        // put your code here
        this.num2=n2;
    }

    public void opera() throws IllegalArgumentException
    {
        switch(op){
            case SUMA:
                rdo=num1+num2;
                break;
            case RESTA:
                rdo=num1-num2;
                break;
            case MULTIPLICA:
                rdo=num1*num2;
                break;
            case DIVIDE:
                if (num2 == 0)
                    throw new IllegalArgumentException("No se puede dividir entre 0");
                rdo=num1/num2;
                break;
        }
    }
    public void ponOperacion(String opera) throws IllegalArgumentException {
        switch(opera){
        
        case "SUMA":
            op=op.SUMA;
            break;
        case "RESTA":
            op=op.RESTA;
            break;
        case "MULTIPLICA":
            op=op.MULTIPLICA;
            break;
        case "DIVIDE":
            op=op.DIVIDE;
            break;
        default:
            throw new IllegalArgumentException("Operacion invalida");
        }
    }
    public double dameResultado()
    {
        // put your code here
        return rdo;
    }

}
