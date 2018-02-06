package sda.cards.fileReader;


import sda.cards.rules.IssuerRule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RulesFileBuilder extends AbstractIFileReader {
    public RulesFileBuilder(String path) {
        super(path);
    }

    public IssuerRule[] readData() {
        IssuerRule[] rules = new IssuerRule[7];
        int i = 0;

        try {
            try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

                String line;
                while((line=bf.readLine())!=null){
                    String[] split = line.split(";");
                    IssuerRule data = new IssuerRule(split[0]);
                    data.setPrefix(split[1]);
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
