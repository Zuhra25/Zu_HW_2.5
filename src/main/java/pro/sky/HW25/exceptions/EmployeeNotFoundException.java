package pro.sky.HW25.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String a) {
        super(a);
    }
}
