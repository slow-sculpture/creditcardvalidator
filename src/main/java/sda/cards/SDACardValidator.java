package sda.cards;

public class SDACardValidator implements ICardValidator {

    public ValidationResult validateCardNo(String cardNo) {
        ValidationResult result = new ValidationResult();


        IIssuerDetector detector = new IIssuerDetectroImpl();
        String issuer = detector.detectIssuer(cardNo);

        ILuhnValidator validator = new LuhnValidatorImpl();
        boolean isLuhnPassed = validator.isCorrect(cardNo);

        result.setIssuer(issuer);
        result.setLuhnPassed(isLuhnPassed);
        return result;
    }


}
