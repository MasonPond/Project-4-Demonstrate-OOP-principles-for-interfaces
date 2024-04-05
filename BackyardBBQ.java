public class BackyardBBQ implements Meal_Cook {
    private String meatType;
    private String grillType;

    public BackyardBBQ(String meatType, String grillType) {
        this.meatType = meatType;
        this.grillType = grillType;
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Marinating " + meatType + ".");
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + meatType + " on a " + grillType + " grill.");
    }

    @Override
    public String getEquipment() {
        return grillType + " grill";
    }

    @Override
    public String toString() {
        return "Backyard BBQ with " + meatType + " on a " + grillType + " grill.";
    }
}
