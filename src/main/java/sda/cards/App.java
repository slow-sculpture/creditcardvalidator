package sda.cards;


import sda.cards.cardValidator.ICardValidator;
import sda.cards.cardValidator.SDACardValidator;
import sda.cards.cardValidator.ValidationResult;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj nr karty: ");
        String cardNo = scanner.nextLine();


        //ponizsze spoko ale latwiej bedzie wywolac
        //detector w klasie SDACardValidator na obiekcie result
        /*IIssuerDetector detectIssuer = new IssuerDetectorImpl();
        String issuer = detectIssuer.detectIssuer(cardNo);
        System.out.println("Issuer: " + issuer);*/


        ICardValidator validator = new SDACardValidator();
        ValidationResult result = validator.validateCardNo(cardNo);


       System.out.println("ISSUER: " + result.getIssuer());
       System.out.println("LUHN PASSED: " + result.isLuhnPassed());

    }



}
