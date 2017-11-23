package Java809.Q67;

/**
 * Created by KellyR on 25/10/2017.
 */
public enum USCurrency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);
    private int value;

    USCurrency(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
