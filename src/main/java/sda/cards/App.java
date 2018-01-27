package sda.cards;


import sda.cards.fileReader.RulesFileReader;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Podaj sciezke do pliku z regulami:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        RulesFileReader rules = new RulesFileReader(path);
        CardData[] data = rules.readData();

        for(int i = 0; i<data.length; i++){
            System.out.println(data[i]);
        }


        ICardValidator validator = new SDACardValidator();
        int[] cardNo = {4,7,1,6,3,8,9,0,0,4,9,9,1,4,1,4};
        validator.validateCardNo(cardNo);



    }
}
