package sda.cards;


import sda.cards.fileReader.RulesIFileReader;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Podaj sciezke do pliku z regulami:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        RulesIFileReader rules = new RulesIFileReader(path);
        IssuerRules[] data = rules.readData();

        for(int i = 0; i<data.length; i++){
            System.out.println(data[i]);
        }


        ICardValidator validator = new SDACardValidator();
        ValidationResult result = validator.validateCardNo(args[0]);
        System.out.println("ISSUER: " + result.getIssuer());
        System.out.println("LUHN PASSED: " + result.isLuhnPassed());






    }
}
