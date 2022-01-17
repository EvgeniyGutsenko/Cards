import Exception.InvalidDataException;
import Exception.InsufficientFundsException;
import java.math.BigDecimal;
import java.util.Objects;

public class Atm {

   Card card;

    public Atm(Card card){
        validateInputDate(card);
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public BigDecimal addBalance(BigDecimal money){
        return card.addBalance(money);
    }

    public BigDecimal subtractBalance(BigDecimal money){
        try {
            return card.subtractBalance(money);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
        return card.balance;
    }

    private void validateInputDate(Card card){
        if (card == null) {
            throw new InvalidDataException("Card id null");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atm)) return false;
        Atm atm = (Atm) o;
        return getCard().equals(atm.getCard());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCard());
    }

    @Override
    public String toString() {
        return "Atm{" +
                "card=" + card +
                '}';
    }
}
