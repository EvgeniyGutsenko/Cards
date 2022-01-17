import java.math.BigDecimal;
import Exception.InsufficientFundsException;
public class DebitCard extends Card{

    public DebitCard(String name){
        super(name);
    }

    public DebitCard(String name, BigDecimal balance){
        super(name, balance);
    }

    @Override
    public BigDecimal subtractBalance(BigDecimal money) throws InsufficientFundsException {
        if (balance.compareTo(money) >= 0) {
            return balance = balance.subtract(money);
        } else {
            throw new InsufficientFundsException("No money, top up your balance");
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
