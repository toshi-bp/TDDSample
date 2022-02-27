package money.ch15;

public interface Expression {
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
}
