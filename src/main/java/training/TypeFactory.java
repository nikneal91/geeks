package training;

public class TypeFactory {

    public static Type getInstance(String type) throws CarException {
        if ( "sedan".equalsIgnoreCase(type)){
            return  Type.Sedan;
        } else if ( "hashback".equalsIgnoreCase(type)){
            return  Type.HashBack;
        } else if("SUV".equalsIgnoreCase(type)){
            return Type.SUV;
        }else {
            throw new CarException("Type is not valid");
        }


    }
}
