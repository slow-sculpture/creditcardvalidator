package sda.cards;

public class IssuerRule {
    private String issuer;
    private String prefix;
    private int noLength;

    public IssuerRule(String issuer) {
        this.issuer = issuer;
    }

    public IssuerRule(String issuer, String prefix, int noLength) {
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

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNoLength() {
        return noLength;
    }


    public void setNoLength(int noLength) {
        this.noLength = noLength;


    }
}
