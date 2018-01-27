package sda.cards;

public interface ICardValidator {
    ValidationResult validateCardNo(int[] number);
    //ValidationResult validateCardNo(String cardNo);
}
