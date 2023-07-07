package pro.sky.HW25.exceptions;

public class EmployeeAlreadyAddedException extends RuntimeException{
    public EmployeeAlreadyAddedException (String a){
        super(a);
    }
}
