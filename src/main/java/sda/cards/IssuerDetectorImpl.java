package sda.cards;

import java.util.List;

/**
 * Klasa ma za zadanie wczytac plik, zbudowac liste regul
 * i przyrownac regule do numeru  karty
 * jesli regula zostanie dopasowana do nr karty
 * meroda detect issuer zwraca nazwe issuer
 */
public class IssuerDetectorImpl implements IIssuerDetector {
    @Override
    public String detectIssuer(String cardNo) {
        IssuerRuleBuilder ruleBuilder = new IssuerRuleBuilder();
        List<IssuerRule> rules = ruleBuilder.prepareRules();

        for(IssuerRule rule : rules){
            //TODO: spr czy prefix i dlugosc sie zgadzaja
            //jesli tak to zwracamy name
          //  cardNo.startsWith()
        }
        return null;
    }
}
