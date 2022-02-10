public class AllMyPets
{
    public static void main (String[] args)
    {
        myPets testPet = new myPets(false, "food", 2, "Test Pet");
        System.out.println(testPet.toString() + "\n");

        Frog shrimp = new Frog(false, true, "worms", 6, "Shrimp");
//        System.out.println(shrimp.toString()+ "\n");

        Hamster jgerome = new Hamster(false, true, true,
                    "rats", 0.5, "Jgerome");
//        System.out.println(jgerome.toString());

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
    }//end main method
}//end driver class AllMyPets
