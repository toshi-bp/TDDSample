package money.ch01;

public class Dollar {
    int amount;
    Dollar (int amount) {
        this.amount = amount;
    }
    void times (int multiplier) {
        amount = amount * multiplier;
    }
}
