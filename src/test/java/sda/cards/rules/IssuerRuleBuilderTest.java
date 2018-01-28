package sda.cards.rules;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class IssuerRuleBuilderTest {
    @Test
    public void buildRules() throws Exception {
        IssuerRuleBuilder builder = new IssuerRuleBuilder();
        List<IssuerRule> rules = builder.buildRules();

        assertTrue(rules.size()==7);


    }

}