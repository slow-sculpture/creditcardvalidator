package sda.cards.issuerDetector;

import sda.cards.rules.IssuerRule;
import sda.cards.fileReader.RulesFileReader;

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

        String issuer = "Unsupported";

        for (IssuerRule data : rules) {
            //TODO: spr czy prefix i dlugosc sie zgadzaja
            //jesli tak to zwracamy name

            //ja sobie zmienilem prefix na String i dziala
            //on w if przekonwertowal inta na String o tak:
            // cardNo.startsWith(String.valueOf(issuerRule.getPrefix()))

            if (cardNo.startsWith(data.getPrefix()) && cardNo.length()==data.getNoLength()) {
                issuer = data.getIssuer();
                System.out.println(issuer);
                return issuer;
            }

        }
        return issuer;
    }


}
