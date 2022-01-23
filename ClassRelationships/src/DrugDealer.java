public class DrugDealer {
    String name;
    String gender;
    Drug drug;
    int amount;

    public DrugDealer (String nameDealer, String genderDealer, int amountDealt) {
        name = nameDealer;
        gender = genderDealer;
        amount = amountDealt;
        drug = new Drug("Kokain", 2);


    }
    public Drug buyDrug() {
        if (amount >= 1){
            amount--;
            return drug;
        }
        else
            return null;
        }


    }


