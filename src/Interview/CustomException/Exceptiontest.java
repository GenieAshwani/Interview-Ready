package Interview.CustomException;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



class SalaryException extends RuntimeException{

    SalaryException()
    {
        super();
    }
    SalaryException(String msg){
        super(msg);
    }
}

public class Exceptiontest{
    public static void main(String[] args) {
        int salary=3;
        if(salary<100){
            throw new SalaryException("Salary is below");
        }
    }
}


