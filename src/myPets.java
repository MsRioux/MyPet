public class myPets
{
    //1 Instance Variables
        public boolean isFriendly;
        public String foodType;
        public double amtSleep;
        public String name;
        public int age;

    //2 Constructors
        public myPets (boolean isFriendly, String foodType, double amtSleep, String name, int age)
        {
            this.isFriendly = isFriendly;
            this.foodType = foodType;
            this.amtSleep = amtSleep;
            this.name = name;
            this.age = age;
        }

    //4 Getters

        public double getAmtSleep() {
            return amtSleep;
        }

        public int getAge() {
            return age;
        }

        public String getFoodType() {
            return foodType;
        }

        public String getName() {
            return name;
        }

        public boolean getIsFriendly() {
            return isFriendly;
        }

        //5 Setters


        public void setAmtSleep(double amtSleep) {
            this.amtSleep = amtSleep;
        }

        public void setAge(int age) {
            this.age = age;
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

    //6 Brain Methods
        public int sleepInSeconds()
        {
            return (int)(amtSleep * 3600);
        }

        public int monthlyFeedings()
        {
            return 30;
        }


    //3 toString
        public String toString()
        {
            String output = "Name: " + name +
                            "\nAge: " + age +
                            "\nFriendly: " + isFriendly +
                            "\nHours of sleep: " + amtSleep +
                            "\nType of food: " + foodType;
            return output;
        }

}
