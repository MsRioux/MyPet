public class Hamster extends myPets
{
    //1Instance Variables
    private boolean needToEx;//Do I need to exercise it?
    private boolean needsGrooming; //long hair vs short hair

    //2 Constructors
    public Hamster (boolean needToEx, boolean needsGrooming, boolean isFriendly,
                        String foodType, double amtSleep, String name )
    {
        super(isFriendly, foodType, amtSleep, name);
        this.needToEx = needToEx;
        this.needsGrooming = needsGrooming;
    }
    //4 Getters

    public boolean getNeedsGrooming() {
        return needsGrooming;
    }

    public boolean getNeedsToEx ()
    {
        return needToEx;
    }

    //5 Setters
    public void setNeedToEx(boolean needToEx)
    {
        this.needToEx = needToEx;
    }

    public void setNeedsGrooming(boolean needsGrooming)
    {
        this.needsGrooming = needsGrooming;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                        "\nNeeds to be exercised: " + needToEx +
                        "\nNeeds to be groomed: " + needsGrooming;
        return output;
    }
}
