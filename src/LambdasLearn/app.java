import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

public class app {
    public static <arg2> void main(String[] args) {
//        Human akash = new Human();
//        akash.walk();
//
//        Robot chitti = new Robot();
//        walker(chitti);

//        walker(new Walkable() { //this is an example of anonymous class, generating object here only by using walkable interface
//            @Override
//            public void walk() { //this is not tied to any class like the human and robot above..this is earlier example of functional programming before lambdas
//                System.out.println("alien is walking");
//            }
//        });

//        walker(() -> System.out.println("alien is walking")); //THIS IS NOW A LAMBDA EXPRESSION ..NO NEED FOR PUBLIC VOID..NO METHOD OBJECT CREATION
//
//
//        walker(() -> {
//            System.out.println("alien2 is walking");
//            System.out.println("this is another example where multilines code can be used inside lambdas");

//        }); //THIS IS NOW A LAMBDA EXPRESSION ..NO NEED FOR PUBLIC VOID..NO METHOD OBJECT CREATION where curly braces are also needed


//lambda function can be assigned to a variable with TYPE a functional Interface only..that it interface must only have ONE method
//        LambdaInterface aBlockOfCode = () -> { //here to shift this lambda expression to a VARIABLE we have to use a Functional Interface before it
//            System.out.println("this is another way of using Lambda");
//            System.out.println("Multilines lambdas can also be used for loops etc ");
//
//        };


        //Walkable is also a functional interface there fore we can also use
//        Walkable aBlockOfCode = () -> { //here to shift this lambda expression to a VARIABLE we have to use a Functional Interface before it
//            System.out.println("this is when we used Walkable as the datatype of the variable to which lambda is assigned");
//            System.out.println("yo yo honey singh");
//
//        };
//        //if we have
//        walker(aBlockOfCode); //to use this we must have used WALKABLE interface to the aBlockOfCode.



       LambdaInterface hellVar = () -> System.out.println("this is the first line");

       hellVar.humping();//this method is defined in the hellvar class
       Sum2 sumVar = (a,b) -> a+b;
        System.out.println(sumVar.sum2(10,5));

       Sum2 nonZeroDivider = (k,v) -> {
            if(k == 0){
                return -1;
            }
            return k/v;

        };
        System.out.println(nonZeroDivider.sum2(10,5));

    }

    public int sum(int arg1,int arg2){
        return arg1+arg2;
    }
    public void sayHello(){
        System.out.println("Hello There God");
    }

    public static void walker(Walkable walkableEntity){
        walkableEntity.walk();
    }




}

