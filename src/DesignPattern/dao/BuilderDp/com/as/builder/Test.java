package DesignPattern.dao.BuilderDp.com.as.builder;

public class Test {

    public static void main(String[] args) {
        Mobile mobile=new Mobile.Builder("oneplush").setColor("black").build();
        System.out.println(mobile.getProcessor());
    }
}
