package sda.cards;


import org.junit.Assert;
import org.junit.Test;
import sda.cards.luhnValidator.ILuhnValidator;
import sda.cards.luhnValidator.LuhnValidatorImpl;

public class LuhnValidatorImplTest {
    @Test
    public void isCorrect()  {
        String cardNo="18606";
        ILuhnValidator check = new LuhnValidatorImpl();
        boolean result = check.isCorrect(cardNo);
        Assert.assertTrue(result);
    }

}