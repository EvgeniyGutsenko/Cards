import java.math.BigDecimal;
import java.util.Objects;
import Exception.InsufficientFundsException;

public abstract class Card {

    protected String name;
    protected BigDecimal balance;

    public Card(String name) {
        this.name = name;
        this.balance = balance.ZERO;
    }

    public Card(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal addBalance(BigDecimal money) {
        return balance = balance.add(money);
    }

    public abstract BigDecimal subtractBalance(BigDecimal money) throws InsufficientFundsException;

    public BigDecimal converterBalance(BigDecimal conversionRate) {
        return balance = balance.multiply(conversionRate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return getName().equals(card.getName()) && getBalance().equals(card.getBalance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBalance());
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
