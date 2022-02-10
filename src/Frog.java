public class Frog extends myPets
{
    //1 Instance Variables
    private boolean isPoisonous;
    //2 Constructors
    public Frog (boolean isPoisonous, boolean isFriendly, String foodType,
                 double amtSleep, String name, int age)
    {
        super (isFriendly, foodType, amtSleep, name, age);
        this.isPoisonous = isPoisonous;
    }

    //4 Getters
    public boolean getIsPoisonous()
    {
        return isPoisonous;
    }

    //5 Setters

    public void setIsPoisonous(boolean isPoisonous) {
        this.isPoisonous = isPoisonous;
    }

    //brain method
    @Override
    public int monthlyFeedings()
    {
        int numFeeds = 30;
        //1y+ once a week,
        //younger, every day
        if( age >= 1)
        {
            numFeeds = 4;
        }
        return numFeeds;
    }

    //3 ToString
    public String toString()
    {
        String output = super.toString() +
                    "\nIs Poisonous: " + isPoisonous;
        return output;
    }//end toString

}//end child class Frog
