public class HeartyStew implements Meal_Cook {
    private String mainIngredient;
    private String potType; // "Crockpot" or "Stovetop"

    public HeartyStew(String mainIngredient, String potType) {
        this.mainIngredient = mainIngredient;
        this.potType = potType;
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Preparing and chopping ingredients for the stew, main ingredient: " + mainIngredient + ".");
    }

    @Override
    public void cook() {
        System.out.println("Cooking stew in a " + potType + ".");
    }

    @Override
    public String getEquipment() {
        return potType;
    }

    @Override
    public String toString() {
        return "Hearty Stew with " + mainIngredient + " in a " + potType + ".";
    }
}
