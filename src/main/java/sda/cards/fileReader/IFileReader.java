package sda.cards.fileReader;

import sda.cards.rules.IssuerRule;

public interface IFileReader {
    IssuerRule[] readData();
}
