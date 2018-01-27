package sda.cards;


import java.util.List;
import java.util.Scanner;

/**
 * Zadaniem klasy jest otwarcie pliku, przetworzenie go linia po linii
 * oraz stworzenie listy zawierającej reguły typu IssuerRule
 */

public class IssuerRuleBuilder {
    public List<IssuerRule> prepareRules(){
        //TODO: wczytanie pliku, przetworzenie pliku i zbudowanie listy zawierającej reguły
        System.out.println("Podaj sciezke do pliku z regulami:");

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        return null;
    }
}
