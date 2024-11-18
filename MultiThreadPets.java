public class MultiThreadPets extends Thread {
    private int type;
    private int rarity;
    private int id;
    public MultiThreadPets (int type, int rarity, int id) {
        this.type = type;
        this.rarity = rarity;
        this.id = id;
    }

    @Override
    public void run() {
        pet Pet = new pet();
        Pet.PetSummon(type, rarity, id);
    }
}