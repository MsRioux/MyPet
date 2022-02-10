public class AllMyPets
{
    public static void main (String[] args)
    {
        myPets testPet = new myPets(false, "food", 2, "Test Pet", 100);
        System.out.println(testPet.toString() + "\n");

        Frog shrimp = new Frog(false, true, "worms", 6, "Shrimp", 0);
        System.out.println(shrimp.toString()+ "\n");

        Hamster jgerome = new Hamster(false, true, true,
                    "rats", 0.5, "Jgerome", 999999999);
        System.out.println(jgerome.toString());

        /*testing getters and setters
        testPet.setName("NaMe");
        System.out.println("Test pet is now named: " + testPet.getName());

        shrimp.setIsPoisonous(true);
        System.out.println("Shrimp's poisonous state: " + shrimp.getIsPoisonous());

        jgerome.setIsFriendly(false);
        System.out.println("Jgerome's current friendliness: " + jgerome.getIsFriendly());
        */
        //testing brain method
        System.out.println("Jgerome's sleep in seconds: " + jgerome.sleepInSeconds());

        System.out.println("Feed Shrimp: " + shrimp.monthlyFeedings());
    }//end main method
}//end driver class AllMyPets
