package sda.cards;

public class CardData {
    private String issuer;
    private int prefix;
    private int noLength;

    public CardData(String issuer) {
        this.issuer = issuer;
    }

    public CardData(String issuer, int prefix, int noLength) {
        this.issuer = issuer;
        this.prefix = prefix;
        this.noLength = noLength;
    }
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getNoLength() {
        return noLength;
    }


    public void setNoLength(int noLength) {
        this.noLength = noLength;


    }
}
