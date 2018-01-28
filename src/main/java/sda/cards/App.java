package sda.cards;


import sda.cards.fileReader.IFileReader;
import sda.cards.fileReader.RulesFileReader;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Podaj nr karty: ");
        String cardNo = scanner.nextLine();

        IIssuerDetector detectIssuer = new IssuerDetectorImpl();
        detectIssuer.detectIssuer(cardNo);


      /*  ICardValidator validator = new SDACardValidator();
        ValidationResult result = validator.validateCardNo(args[0]);
        System.out.println("ISSUER: " + result.getIssuer());
        System.out.println("LUHN PASSED: " + result.isLuhnPassed());*/

    }



}
