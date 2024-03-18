
public class FizzBuzz {
    public int Condicion(int a) {

        int b = a; 
        if(b % 3 == 0){
            if(b == 15){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println("Fizz");
            }
        }
        else if(b % 5 == 0){
            System.out.println("Buzz");
        }  
        return b;  //no se como eliminarlo
    }
}


