package Test;

import org.junit.Assert;
import java.math.BigDecimal;
import Exception.InsufficientFundsException;
import org.junit.Before;
import org.junit.Test;
import Cards.*;

public class AtmTest {

    Card expectedDebitCard;
    Card expectedCreditCard;

    @Before
    public void setCard(){
        expectedDebitCard = new DebitCard("Петя", new BigDecimal(100));
        expectedCreditCard = new CreditCard("Коля", new BigDecimal(100));
    }

    @Test
    public void addBalance() {

        expectedDebitCard.addBalance(new BigDecimal(50));

        Card actualDebitCard = new DebitCard("Петя",new BigDecimal(150));

        Assert.assertEquals(expectedDebitCard,actualDebitCard);

        expectedCreditCard.addBalance(new BigDecimal(50));

        Card actualCreditCard = new CreditCard("Коля",new BigDecimal(150));

        Assert.assertEquals(expectedCreditCard, actualCreditCard);
    }

    @Test
    public void subtractBalance() throws InsufficientFundsException {

        expectedDebitCard.subtractBalance(new BigDecimal(50));

        Card actualDebitCard = new DebitCard("Петя", new BigDecimal(50));

        Assert.assertEquals(expectedDebitCard, actualDebitCard);

        expectedCreditCard.subtractBalance(new BigDecimal(200));

        Card actualCreditCard = new CreditCard("Коля", new BigDecimal(-100));

        Assert.assertEquals(expectedCreditCard, actualCreditCard);
    }

    @Test
    public void converterBalance(){

        expectedDebitCard.converterBalance(new BigDecimal(2));

        Card actualDebitCard = new DebitCard("Петя", new BigDecimal(200));

        Assert.assertEquals(expectedDebitCard,actualDebitCard);

        expectedCreditCard.converterBalance(new BigDecimal(4));

        Card actualCreditCard = new CreditCard("Коля", new BigDecimal(400));

        Assert.assertEquals(expectedCreditCard,actualCreditCard);
    }
}