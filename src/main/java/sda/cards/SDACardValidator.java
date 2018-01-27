package sda.cards;

public class SDACardValidator implements ICardValidator {
    public ValidationResult validateCardNo(int[] number){
   // public ValidationResult validateCardNo(String cardNo){
        //TODO: implementacja
        number = new int[16];
                //{4,7,1,6,3,8,9,0,0,4,9,9,1,4,1,4};

        checkIssuer(number);

        /*int i;
        for(i =number.length-1; i<number.length; i-=2){
            System.out.println(number[i]);
        }
*/
        return null;
    }

    private String checkIssuer(int[] no) {
        //w petli przejechac po numerze karty
        // i spr prefix oraz dlugosc
        //wyswietlic jaki dostawca

        for(int i =0; i<no.length;i++){
            if(no.length==16 && no[0] ==4){
                String issuer = "Visa";
                return issuer;
            }
        }
        return null;

    }
}
