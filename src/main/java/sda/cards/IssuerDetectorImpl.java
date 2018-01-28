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



        RulesFileReader ruleBuilder = new RulesFileReader("C:\\Users\\chris\\IdeaProjects\\validator\\src\\main\\java\\sda\\cards\\cardRules");
        IssuerRule[] rules = ruleBuilder.readData();

        String issuer = "noname";

        for (IssuerRule data : rules) {
            //TODO: spr czy prefix i dlugosc sie zgadzaja
            //jesli tak to zwracamy name
            if (cardNo.startsWith(data.getPrefix()) && cardNo.length()==data.getNoLength()) {
                System.out.println(data.getIssuer());
                break;
            }
        }
        return null;
    }


}
