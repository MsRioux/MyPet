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
