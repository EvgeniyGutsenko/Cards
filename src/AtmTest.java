import org.junit.Assert;
import java.math.BigDecimal;
import Exception.InsufficientFundsException;

public class AtmTest {

    @org.junit.Test
    public void addBalance() {
        Card expectedDebitCard = new DebitCard("Петя", new BigDecimal(0));

        expectedDebitCard.addBalance(new BigDecimal(88.88));

        Card actualDebitCard = new DebitCard("Петя", new BigDecimal(88.88));

        Assert.assertEquals(expectedDebitCard, actualDebitCard);

        Card expectedCreditCard = new CreditCard("Петя", new BigDecimal(0));

        expectedCreditCard.addBalance(new BigDecimal(77.77));

        Card actualCreditCard = new DebitCard("Петя",new BigDecimal(77.77));

        Assert.assertEquals(expectedCreditCard, actualCreditCard);
    }

    @org.junit.Test
    public void subtractBalance() throws InsufficientFundsException {

        Card expectedDebitCard = new DebitCard("Коля", new BigDecimal(100));

        expectedDebitCard.subtractBalance(new BigDecimal(50));

        Card actualDebitCard = new DebitCard("Коля", new BigDecimal(50));

        Assert.assertEquals(expectedDebitCard, actualDebitCard);

        Card expectedCreditCard = new CreditCard("Коля", new BigDecimal(100));

        expectedCreditCard.subtractBalance(new BigDecimal(200));

        Card actualCreditCard = new CreditCard("Коля", new BigDecimal(-100));

        Assert.assertEquals(expectedCreditCard, actualCreditCard);


    }

    @org.junit.Test
    public void converterBalance(){
        Card expectedCard = new DebitCard("Петя", new BigDecimal(2));

        expectedCard.converterBalance(new BigDecimal(2));

        Card actualCard = new DebitCard("Петя", new BigDecimal(4));
    }
}