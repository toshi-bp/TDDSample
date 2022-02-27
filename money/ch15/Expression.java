package money.ch15;

public interface Expression {
    Money reduce(Bank bank, String to);
}
