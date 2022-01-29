package Cards;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(String name){
        super(name);
    }
    public CreditCard(String name, BigDecimal balance){
        super(name, balance);
    }

    @Override
    public BigDecimal subtractBalance(BigDecimal money){
        return balance = balance.subtract(money);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
