package sda.cards.cardValidator;

public class ValidationResult {
    private String issuer;
    private Boolean luhnPassed;     //lub private boolean luhnResult = false;
                                    //z duzej litery nie wymaga przypisania - moze byc null

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Boolean isLuhnPassed() {
        return luhnPassed;
    }

    public void setLuhnPassed(Boolean luhnPassed) {
        this.luhnPassed = luhnPassed;
    }
}

