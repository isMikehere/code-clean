

/**
 * 
 */
public class EmployeeFactoryImpl implements EmployeeFactory{

    public Employee makeEmployee(EmplyeeRecord r) throws InvalidEmployeeType{
        switch (r.type) {
            case COMMISSION: 
              return new CommissionEmployee(r);
            case HOURLY: 
              return new Hourly(r);
            default:
                throw new InvalidEmployeeType();
        }                          
    }

}