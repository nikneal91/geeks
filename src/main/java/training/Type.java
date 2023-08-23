package training;

public enum Type {
    HashBack(5),
    Sedan(8),
    SUV(10);

    private int premium;

     Type(int premium) {
        this.premium = premium;
    }

    public int getPremium(){
         return this.premium;
    }


}
