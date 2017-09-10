/**
 * issue:
 * if new type of empolyee added ,
 * then swith case will be expand,
 * which will make the method hard
 * to read 
 * 
 * solutaion:
 * 
 * 
 * 
 */
public class SwithcTune {
    public Money CalculatePay(Employee e) 
       throws InvalidEmployeetype{

        switch(e.type){
            case COMMISSIONED:
                return caculateCommissiond(e);
            case HOURLY:
                return calculateHourly(e);
            case SALIDAY:
                return calculateSaliday(e);
            default:
                throw new invalideType(e);
        }
    }
}