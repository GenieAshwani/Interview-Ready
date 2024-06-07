package Java8;

interface Lambda
{
    public void m1();
}

public class LambdaDemo {
    public static void main(String[] args) {
        Lambda i=()-> System.out.println("hello");
        i.m1();
    }
}
