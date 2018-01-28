package sda.cards.luhnValidator;

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

        /**jego wersja

        int[] carNumberArray = new int[cardNo.length()];
        for (int i = 0l i < cardNo.length(); i++) {
            carNumberArray[i] = Character.getNumericValue(cardNo.charAt(i));
        }
        int sum = 0;
        int j = 0;
        for (int i = carNumberArray.length - 1; i >= 0; i--) {
            int element = carNumberArray[i];
            j++;
            if (j % 2 == 0) {
                element=element*2;
                if(element>=10){
                    element=element-9;
                }
            }
        sum=sum+element;
        }
        return sum%10==0;*/
    }
}
