package pro.sky.HW25.exceptions;

public class EmployeeStorageIsFullException extends  RuntimeException{
    public EmployeeStorageIsFullException (String a){
        super(a);
    }
}
