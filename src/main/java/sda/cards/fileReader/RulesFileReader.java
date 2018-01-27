package sda.cards.fileReader;


import sda.cards.CardData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RulesFileReader extends AbstractFileReader {
    public RulesFileReader(String path) {
        super(path);
    }

    public CardData[] readData() {
        CardData[] rules = new CardData[7];
        int i = 0;

        try {
            try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

                String line;
                while((line=bf.readLine())!=null){
                    String[] split = line.split(";");
                    CardData data = new CardData(split[0]);
                    data.setPrefix(Integer.parseInt(split[1]));
                    data.setNoLength(Integer.parseInt(split[2]));
                    rules[i++] = data;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


        return rules;
    }
}
