package lambda2;

public class Application {

    public static void main(String[] args) {


       Minus subtraction = (a,b) -> {

           return a - b;
       };
        System.out.println(subtraction.sub(12,6));
    }

    public static int subtract(int a, int b){
        return a - b;
    }
}
