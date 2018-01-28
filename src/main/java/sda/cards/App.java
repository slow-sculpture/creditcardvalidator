package sda.cards;


import sda.cards.fileReader.IFileReader;
import sda.cards.fileReader.RulesFileReader;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //loadRules();

        passCardNumber();


        ICardValidator validator = new SDACardValidator();
        ValidationResult result = validator.validateCardNo(args[0]);
        System.out.println("ISSUER: " + result.getIssuer());
        System.out.println("LUHN PASSED: " + result.isLuhnPassed());

    }


    private static void loadRules() {
        System.out.println("Podaj sciezke do pliku z regulami:");

        String path = scanner.nextLine();

        IFileReader rules = new RulesFileReader(path);
        IssuerRule[] data = rules.readData();
    }

    private static void passCardNumber() {
        System.out.println("Podaj nr karty: ");
        String cardNo = scanner.nextLine();
    }
}
