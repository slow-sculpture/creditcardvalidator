package sda.cards.fileReader;

import sda.cards.IssuerRules;

public abstract class AbstractIFileReader implements IFileReader {
    protected String path;

    public AbstractIFileReader(String path) {
        this.path = path;
    }

    public abstract IssuerRules[] readData();
}
