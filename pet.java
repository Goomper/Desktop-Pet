import java.awt.*;
import javax.swing.*;

public class pet {
    JFrame frame;
    JPanel panel;

    public void PetSummon(int type, int rarity, int id) {
        panel = new JPanel();
        frame = new JFrame();
        frame.setUndecorated(true);

        frame.add(panel);

        Color bgColor = new Color(0,0,0,1);

        frame.setAlwaysOnTop(true);
        frame.setSize(64,64);
        frame.setBackground(bgColor);
        frame.setTitle("pet");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        String[] commonArray = {"commonZero", "commonOne", "commonTwo", "commonThree", "commonFour"};
        String[] rareArray = {"rareZero"};
        String[] epicArray = {"epicZero", "epicOne", "epicTwo", "epicThree", "epicFour"};
        String[] legendaryArray = {"legendaryZero", "legendaryOne", "legendaryTwo", "legendaryThree", "legendaryFour"};

        String[][] rarityArray = new String[][] {commonArray, rareArray, epicArray, legendaryArray};

        if (rarityArray[rarity][id] == "commonZero") {
            ImageIcon image1 = new ImageIcon("sprites\\commonZero\\PetDown.png");
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying(type, rarity, id);
        } else if (rarityArray[rarity][id] == "commonOne") {
            ImageIcon image1 = new ImageIcon("sprites\\sans.png");
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying(type, rarity, id);
        } else if (rarityArray[rarity][id] == "commonTwo") {
            ImageIcon image1 = new ImageIcon("sprites\\Papyrus.png");
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying(type, rarity, id);
        } /*else if (rarityArray[rarity][id] == "commonThree") {
            ImageIcon image1 = new ImageIcon("sprites\\never_say_this-to-a-sigma.gif");
            frame.setSize(150,200);
            image1.setImage(image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying(type, rarity, id);
        } else if (rarityArray[rarity][id] == "commonFour") {
            ImageIcon image1 = new ImageIcon("sprites\\4.png");
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying();
        } else if (rarityArray[rarity][id] == "rareZero") {
            ImageIcon image1 = new ImageIcon("sprites\\1.png");
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying(type, rarity, id);
        } */
    }

    public void PetMove(int type, int rarity, int id) {
        double randScreenX = Math.random() * (Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        double randScreenY = Math.random() * (Toolkit.getDefaultToolkit().getScreenSize().getHeight());

        if (frame.getLocation().getX() != randScreenX || frame.getLocation().getY() != randScreenY) {
            Point finalPos = new Point();
            finalPos.setLocation(Math.floor(randScreenX), Math.floor(randScreenY));
            double XDistance = finalPos.getX() - frame.getLocation().getX();
            double YDistance = finalPos.getY() - frame.getLocation().getY();
            
            for (int f = 0; f < 180; f++) {
                frame.setLocation((int)frame.getLocation().getX() + ((int)XDistance / 180), (int)frame.getLocation().getY() + ((int)YDistance) / 180);
                /*if (XDistance > 0 && XDistance > YDistance) {
                    
                }*/
                try {
                    Thread.sleep(1000/60);
                } catch (InterruptedException e1) {
                }
            }
        }
        return;
    }

    public void PetBehaviorFlying(int type, int rarity, int id) {
        while (true) {
            double waitTime = (Math.random() * 2) + 1;
            try {
                Thread.sleep((long) (1000 * waitTime));
            } catch (InterruptedException e1) {
            }
            String[] petActions = {"walk", "special"};
            String action = petActions[(int)(Math.random() * petActions.length)];
            if (action == "walk") {
                PetMove(type, rarity, id);
            } else if (action == "special") {
                special PetSpecial = new special();
                PetSpecial.PetSpecialManager(type, rarity, id, frame.getLocation());
            }
        }
    }
}