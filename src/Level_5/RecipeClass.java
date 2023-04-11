package Level_5;

public class RecipeClass {
    int numPerson;
    String ingredient;

    String [] ingredientName = {"Flour", "Milk", "Sugar", "vanilla powder", "cacao powder", "chocolates",};
    double[][] amountPreis = {
            {200.0, 2.20},
            {150.50, 1.10},
            {10.50, 0.20},
            {50, 0.70},
            {250, 3.80}
    };

    double amount;
    double totalCost = 0;

    public boolean allergic(String isThere) {
        boolean thereIs = false;
        for (int i = 0; i < ingredientName.length; i++) {
            ingredient = ingredientName[i];
            ingredient = ingredient.toLowerCase();
            if (isThere.equals(ingredient)) {
                thereIs = true;
            } else {
                thereIs = false;
            }
        }
        return thereIs;
    }

    public boolean lactoseFree() {
        boolean isLactose = false;
        for (int i = 0; i < ingredientName.length; i++) {
            ingredient = ingredientName[i];
            ingredient = ingredient.toLowerCase();
            if (ingredient.equals("milk") || ingredient.equals("cheese")) {
                amount = 0;
                isLactose= true;
            } else {
                isLactose= false;
            }
        }
        return isLactose;
    }

    public double cost() {
        for (int i = 0; i < amountPreis.length; i++) {
            for (int j = 1; j < amountPreis[i].length; j++) {
                totalCost = totalCost + amountPreis[i][1];
            }
        }
        return totalCost;
    }

    public double costPerPerson(int numPerson) {
        return totalCost / numPerson;
    }

    public double changeNumPerson(int numPerson) {
        return totalCost / numPerson;
    }

    public int getNumPerson() {
        return numPerson;
    }

    public void setNumPerson(int numPerson) {
        this.numPerson = numPerson;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public double[][] getAmountPreis() {
        return amountPreis;
    }

    public void setAmountPreis(double[][] amountPreis) {
        this.amountPreis = amountPreis;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}

