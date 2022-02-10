public class myPets
{
    //1 Instance Variables
        public boolean isFriendly;
        public String foodType;
        public double amtSleep;
        public String name;

    //2 Constructors
        public myPets (boolean isFriendly, String foodType, double amtSleep, String name)
        {
            this.isFriendly = isFriendly;
            this.foodType = foodType;
            this.amtSleep = amtSleep;
            this.name = name;
        }

    //4 Getters

    public double getAmtSleep() {
        return amtSleep;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getName() {
        return name;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    //5 Setters


    public void setAmtSleep(double amtSleep) {
        this.amtSleep = amtSleep;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void setIsFriendly(boolean isFriendly) {
        this.isFriendly = isFriendly;
    }

    public void setName(String name) {
        this.name = name;
    }

    //3 toString
        public String toString()
        {
            String output = "Name: " + name +
                            "\nFriendly: " + isFriendly +
                            "\nHours of sleep: " + amtSleep +
                            "\nType of food: " + foodType;
            return output;
        }

}
