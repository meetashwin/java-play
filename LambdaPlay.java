/**
A single method interface is also sometimes referred to as a functional interface. Matching a Java lambda expression against a functional interface is divided into these steps:

Does the interface have only one abstract (unimplemented) method?
Does the parameters of the lambda expression match the parameters of the single method?
Does the return type of the lambda expression match the return type of the single method?
If the answer is yes to these three questions, then the given lambda expression is matched successfully against the interface.

@author Ashwin Chandrasekaran
*/
public class LambdaPlay {

    static String name = "Ashwin";

    public static void main(String[] args) {
        System.out.println("Hello world");

        //Defining a lamba expression
        MathOperation addition = (int a, int b) -> (a+b);
        MathOperation multiplication = (int a, int b) -> (a*b);

        Greeting greeting = (String nx) -> System.out.println("Hello " + nx);

        //Testing the lambda expression
        System.out.println("Testing addition of 3 and 5: " + addition.operation(3,5));
        System.out.println("Testing multiply of 4 and 6: " + multiplication.operation(4,6));

        greeting.sayHello(name);
    }
}

interface MathOperation {
    int operation(int a, int b);
}

interface Greeting {
    void sayHello(String s);
}

