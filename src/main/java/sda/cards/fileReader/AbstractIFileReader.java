package sda.cards.fileReader;

import sda.cards.IssuerRule;

public abstract class AbstractIFileReader implements IFileReader {
    protected String path;

    public AbstractIFileReader(String path) {
        this.path = path;
    }

    public abstract IssuerRule[] readData();
}
