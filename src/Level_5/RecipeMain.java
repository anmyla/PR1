package Level_5;

public class RecipeMain {
    public static void main(String[] args) {

        RecipeClass test = new RecipeClass();
        System.out.println("Is allergic: " + test.allergic("milk"));

        System.out.println("Total cost: " + test.cost());
        System.out.println("Cost per person: " + test.costPerPerson(5));
        System.out.println("Cost per person if number of person is changed: " + test.costPerPerson(10));

    }
}
