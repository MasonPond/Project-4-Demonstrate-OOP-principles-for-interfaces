public class CookingDinner {
    public static void main(String[] args) {
        System.out.println("Course: Java Advanced");
        System.out.println("Assignment: Project 4: Demonstrate OOP principles for interfaces");
        System.out.println("Date: 2024-03-03");
        System.out.println("Student Name: Mason Pond");

        BackyardBBQ bbq = new BackyardBBQ("steak", "charcoal");
        ThanksgivingDinner thanksgiving = new ThanksgivingDinner("15lbs", "herb butter");
        HeartyStew stew = new HeartyStew("beef", "crockpot");

        System.out.println(bbq);
        System.out.println(thanksgiving);
        System.out.println(stew);
    }
}
