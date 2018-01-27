package sda.cards.fileReader;

import sda.cards.CardData;

public abstract class AbstractFileReader implements FileReader {
    protected String path;

    public AbstractFileReader(String path) {
        this.path = path;
    }

    public abstract CardData[] readData();
}
