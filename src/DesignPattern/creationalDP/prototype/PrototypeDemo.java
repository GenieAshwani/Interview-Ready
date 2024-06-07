package DesignPattern.creationalDP.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {

        Book originalBook = new Book("Design Patterns", "Genie Ashwani", 49.99);
        System.out.println("Original: " + originalBook);


        Book clonedBook = (Book) originalBook.clone();
        System.out.println("Cloned: " + clonedBook);


        clonedBook.setTitle("Advanced Design Patterns");
        clonedBook.setPrice(59.99);
        System.out.println("Modified Cloned: " + clonedBook);
        System.out.println("Original remains unchanged: " + originalBook);
    }
}

