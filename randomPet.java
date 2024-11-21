public class randomPet {
    static String petType;

    public static String randompet() {
        String[] PetCommon = {"commonZero", "commonOne", "commonTwo", "commonThree", "commonFour"};
        String[] PetRare = {"rareZero"};
        String[] PetEpic = {"epic0", "epic1", "epic2", "epic3", "epic4"};
        String[] PetLegendary = {"legendary0", "legendary1", "legendary2", "legendary3", "legendary4"};

        int rarityInt = (int)Math.floor(Math.random() * 100);
        String start = "Din rarity blev ";
        String Rarity;

        
        if (rarityInt < 56) {
            System.out.println(start + "common");
            int randomcommon = (int)Math.floor(Math.random() * PetCommon.length);
            petType = PetCommon[randomcommon];
            Rarity = petType;
            return Rarity;
        } else if (rarityInt < 86 && rarityInt >= 56) {
            System.out.println(start + "rare");
            int randomrare = (int)Math.floor(Math.random() * PetRare.length);
            petType = PetRare[randomrare];
            Rarity = petType;
            return Rarity;
        } else if (rarityInt < 96 && rarityInt >= 86) {
            System.out.println(start + "epic");
            int randomepic = (int)Math.floor(Math.random() * PetEpic.length);
            petType = PetEpic[randomepic];
            Rarity = petType;
            return Rarity;
        } else if (rarityInt >= 96) {
            System.out.println(start + "legendary");
            int randomlegendary = (int)Math.floor(Math.random() * PetLegendary.length);
            petType = PetLegendary[randomlegendary];
            Rarity = petType;
            return Rarity;
        } else {
            return null;
        }
    }
}
