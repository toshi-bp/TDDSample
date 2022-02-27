package money.ch16;

public interface Expression {
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
}
