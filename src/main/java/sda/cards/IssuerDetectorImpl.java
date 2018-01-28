package sda.cards;

import sda.cards.fileReader.IFileReader;
import sda.cards.fileReader.RulesFileReader;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Klasa ma za zadanie wczytac plik, zbudowac liste regul
 * i przyrownac regule do numeru  karty
 * jesli regula zostanie dopasowana do nr karty
 * meroda detect issuer zwraca nazwe issuer
 */
public class IssuerDetectorImpl implements IIssuerDetector {
    @Override
    public String detectIssuer(String cardNo) {
        //IssuerRuleBuilder ruleBuilder = new IssuerRuleBuilder();
        // List<IssuerRule> rules = ruleBuilder.prepareRules();

        System.out.println("Podaj sciezke do pliku z regulami:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        IFileReader rulesss = new RulesFileReader(path);
        IssuerRule[] rules = rulesss.readData();
       // List<rules> rULES = Arrays.asList(rules);


        for (IssuerRule rule : rules) {
            //TODO: spr czy prefix i dlugosc sie zgadzaja
            //jesli tak to zwracamy name
            if (cardNo.startsWith("4")) {
                return "Visa";
            } else if (cardNo.startsWith("3")) {

            }
        }
        return null;
    }


}
