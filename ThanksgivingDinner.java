public class ThanksgivingDinner implements Meal_Cook {
    private String turkeySize;
    private String seasoning;

    public ThanksgivingDinner(String turkeySize, String seasoning) {
        this.turkeySize = turkeySize;
        this.seasoning = seasoning;
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Brining turkey that is " + turkeySize + " and applying " + seasoning + ".");
    }

    @Override
    public void cook() {
        System.out.println("Roasting the turkey in an oven using a roasting pan.");
    }

    @Override
    public String getEquipment() {
        return "Oven and Roasting Pan";
    }

    @Override
    public String toString() {
        return "Thanksgiving Dinner with a " + turkeySize + " turkey seasoned with " + seasoning + ".";
    }
}
