package sda.cards.rules;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Zadaniem klasy jest otwarcie pliku, przetworzenie go linia po linii
 * oraz stworzenie listy zawierającej reguły typu IssuerRule
 */

//////// u mnie to robi  RulesFileReader
/// wiec to mi niepotrzebne
//ale przepisalem bo on robi liste a ja robilem tablice

public class IssuerRuleBuilder {
    private final static String FILE_PATH = "C:\\Users\\chris\\IdeaProjects\\validator\\src\\main\\java\\sda\\cards\\cardRules";
    private static final String COMMENT_PREFIX = "#";
    private static final String RULE_SEPARATOR = ";";

    public List<IssuerRule> buildRules() {
        //TODO: wczytanie pliku, przetworzenie pliku i zbudowanie listy zawierającej reguły

        List<IssuerRule>result = new ArrayList<>();
        try {
            try {
                FileReader reader = new FileReader(FILE_PATH);
                BufferedReader bf = new BufferedReader(reader);
                String line = "";
                try {
                    while ((line = bf.readLine()) != null) {
                        if (line.startsWith(COMMENT_PREFIX)) {
                            continue;
                        }
                        String[] tokens = line.split(RULE_SEPARATOR);
                        IssuerRule issuerRule = new IssuerRule(tokens[0]);
                        issuerRule.setPrefix(tokens[1]);
                        issuerRule.setNoLength(Integer.parseInt(tokens[2]));
                        result.add(issuerRule);

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }catch (Exception e){
            e.getMessage();
        }

        return result;
    }
}
