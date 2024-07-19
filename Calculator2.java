import java.util.*;

public class Calculator2{

    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        
      while (true) {
        System.out.print("Enter the operator (+,-,*,/)  or type 'exit' to quit: ");
        
        String op=scan.next();
        if (op.equals("exit")) {
            System.out.println("Exiting the calculator.");
            break;
        }

        System.out.print("ENter no.1 : ");
        double num1=scan.nextDouble();

        System.out.print("ENter no.2 : ");
        double num2=scan.nextDouble();
     

        double result=0;
        switch(op){
            case "+":
                result=num1+num2;
            break;

            case "-":
                result=num1-num2;
            break;

            case "*":
                 result = num1 * num2;
            break;
        
            case "/":
            if(num2!=0){
                result = num1 / num2;
            }
            else{
                System.out.println("Can't Divide By Zero ");
            }
            break;
 
            default :
                System.out.println("Invalid Operation");

        }

        System.out.println(num1 + op + num2 +" is :" + result);
    }

}
}