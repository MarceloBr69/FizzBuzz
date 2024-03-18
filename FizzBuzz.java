import java.util.Scanner;
public class FizzBuzz {
    public static void main(String [] args){
        // lógica de fizzbuzz aquí
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese valor");
        double a = input.nextDouble();


        if(a % 3 == 0){
            if(a == 15){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println("Fizz");
            }
        }
        else if(a % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            int b = (int) a;
            System.out.println(b);
        }
    }
}


