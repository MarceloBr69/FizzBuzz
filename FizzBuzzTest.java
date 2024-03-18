import java.util.Scanner;
public class FizzBuzzTest {
    public static void main(String [] args){
        FizzBuzz iD = new FizzBuzz();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int a = myObj.nextInt();

        int Descubrir = iD.Condicion(a);
        System.out.println(Descubrir);

    }
}
