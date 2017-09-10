 /**
 * a  abstract factory to create all kind of the employeeimpl 
 */
public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecored r) throws InvalidEmployeeType;
}

