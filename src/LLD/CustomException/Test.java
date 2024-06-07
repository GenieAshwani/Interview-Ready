package LLD.CustomException;

public class Test {
    public static void main(String[] args) {

        try {
            throw CustomException.getInstance();
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }


        CustomException ex1 = CustomException.getInstance();
        CustomException ex2 = CustomException.getInstance();
        System.out.println("Are both instances the same? " + (ex1 == ex2));
    }
}
