package sda.cards;

public class LuhnValidatorImpl implements ILuhnValidator {
    @Override
    public boolean isCorrect(String cardNo) {

        boolean result = false;
        int sum = 0;

        //TODO: zaimplementowac algorytm Luhna
        for (int i = cardNo.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNo.substring(i, i + 1));
            if (result) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            result = !result;

        }
        return (sum % 10 == 0);

    }
}
