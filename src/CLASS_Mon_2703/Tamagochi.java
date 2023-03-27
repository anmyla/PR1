package CLASS_Mon_2703;

public class Tamagochi {


    int x;
    int y;
    int foodStore;

    public Tamagochi(int x, int y, int foodStore) {
        this.x = x;
        this.y = y;
        this.foodStore = foodStore;
    }

    public int feedTamagochi(int food){
        this.foodStore = this.foodStore + food;
        return foodStore;
    }

    public void direction (String direction) {
        if (foodStore < 1) {
            return;
        }
        if (direction.equals("down")){
            y--;
        }
        else if (direction.equals("up")){
            y++;
        }
        else if (direction.equals("right")){
            x++;
        }
        else if (direction.equals("left")){
            x--;
        }
        foodStore--;
    }
}


