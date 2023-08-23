package training;

public class InsuranceFactory {

    public static Insurance getInstance(String insurance) throws CarException {
        if ( "basic".equalsIgnoreCase(insurance)) {
            return Insurance.BASIC;
        } else if ( "premium".equalsIgnoreCase(insurance)) {
            return Insurance.PREMIUM;
        } else {
            throw new CarException("Insurance type is not valid");
        }
    }
}
