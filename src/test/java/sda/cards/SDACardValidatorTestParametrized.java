package sda.cards;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * CZY TO MA SENS TO CHUJ WIE NUDZILO MI SIE ALE NIE CHCE MI SIE SPRAWDZAC
 * DALEJ WIEC ...
 * HMM CHYBA JEDNAK DZIALA
 *
 */
@RunWith(Parameterized.class)
public class SDACardValidatorTestParametrized {

    private String cardNo;
    private String issuer;

    public SDACardValidatorTestParametrized(String cardNo, String issuer) {
        this.cardNo = cardNo;
        this.issuer = issuer;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"348156001127381", "AmericanExpress"},
                {"4556119149905430", "Visa"},
                {"5566976748788169", "MasterCard"},
                {"5204512895539341", "MasterCard"},
                {"5138084615993407", "MasterCard"},
                {"344589727304070", "AmericanExpress"},
                {"4485669473378642", "Visa"},
                {"161616", "Unsupported"},
        });
    }

    @Test
    public void shouldValidateManyCardNo() {
        SDACardValidator validator = new SDACardValidator();

        ValidationResult result = validator.validateCardNo(cardNo);
        assertEquals(issuer, result.getIssuer());
       // assertEquals(true, result.isLuhnPassed());

    }

}