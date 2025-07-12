
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string


 */

import java.util.Objects;
import java.util.Scanner;

class Calculator
{

    private double a;
    private double b;
    String typeOfOperation;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double Addition()
    {
        return a+b;

    }
    public double Subtraction()
    {
        return a-b;
    }
    public double Multiplication()
    {
        return a*b;
    }
    public double Division()
    {
        if(b==0) throw  new ArithmeticException(" b can not be zero");
        return a/b;
    }
}

public class Main {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        scanner.nextLine();        
        String operationType=scanner.nextLine().trim().toLowerCase();
        Calculator calculator=new Calculator(a,b);
        if(operationType.equals("addition"))
        {
            System.out.println(calculator.Addition());
        }
        else if (operationType.equals("substraction"))
        {
            System.out.println(calculator.Subtraction());
        }else if(operationType.equals("multiplication"))
        {
            System.out.println(calculator.Multiplication());
        }else if(operationType.equals("division"))
        {
            System.out.println(calculator.Division());
        }else {
            System.out.println("Please enter valid OprationType");
        }




    }
}