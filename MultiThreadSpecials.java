import java.awt.Point;

public class MultiThreadSpecials extends Thread {
    private int type;
    private int rarity;
    private int id;
    private Point pos;
    public MultiThreadSpecials (int type, int rarity, int id, Point pos) {
        this.type = type;
        this.rarity = rarity;
        this.id = id;
        this.pos = pos;
    }

    @Override
    public void run() {
        special PetSpecial = new special();
        PetSpecial.PetSpecialSummon(type, rarity, id, pos);
    }
}