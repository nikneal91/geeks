package training;

public enum Insurance {
    BASIC(0),
    PREMIUM(20);

    private  int premium;

    Insurance(int premium) {
        this.premium =premium;
    }

    public int premium() {
        return premium;
    }
}
