package sda.cards.cardValidator;

import sda.cards.issuerDetector.IIssuerDetector;
import sda.cards.issuerDetector.IssuerDetectorImpl;
import sda.cards.luhnValidator.ILuhnValidator;
import sda.cards.luhnValidator.LuhnValidatorImpl;

public class SDACardValidator implements ICardValidator {

    public ValidationResult validateCardNo(String cardNo) {
        ValidationResult result = new ValidationResult();


        IIssuerDetector detector = new IssuerDetectorImpl();
        String issuer = detector.detectIssuer(cardNo);

        ILuhnValidator validator = new LuhnValidatorImpl();
        boolean isLuhnPassed = validator.isCorrect(cardNo);

        result.setIssuer(issuer);
        result.setLuhnPassed(isLuhnPassed);
        return result;
    }


}
