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
        
        System.err.println(bgColor.getAlpha());

        frame.setAlwaysOnTop(true);
        frame.setSize(64,64);
        frame.setBackground(bgColor);
        frame.setTitle("pet");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        String[] commonArray = {"commonZero", "commonOne", "commonTwo", "commonThree", "commonFour"};
        String[] rareArray = {"rar0", "rar1", "rar2", "rar3", "rar4"};
        String[] epicArray = {"epi0", "epi1", "epi2", "epi3", "epi4"};
        String[] legendaryArray = {"leg0", "leg1", "leg2", "leg3", "leg4"};

        String[][] rarityArray = new String[][] {commonArray, rareArray, epicArray, legendaryArray};

        if (rarityArray[rarity][id] == "commonZero") {
            ImageIcon image1 = new ImageIcon("sprites\\commonZero\\PetDown.png");
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying();
        } else if (rarityArray[rarity][id] == "commonOne") {
            ImageIcon image1 = new ImageIcon("sprites\\1.png");
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying();
        } else if (rarityArray[rarity][id] == "commonTwo") {
            ImageIcon image1 = new ImageIcon("sprites\\2.png");
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying();
        } else if (rarityArray[rarity][id] == "commonThree") {
            ImageIcon image1 = new ImageIcon("sprites\\3.png");
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying();
        } else if (rarityArray[rarity][id] == "commonFour") {
            ImageIcon image1 = new ImageIcon("sprites\\4.png");
            frame.add(new JLabel(image1));
            frame.setVisible(true);
            PetBehaviorFlying();
        }
    }

    public void PetMove() {
        double randScreenX = Math.random() * (Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        double randScreenY = Math.random() * (Toolkit.getDefaultToolkit().getScreenSize().getHeight());

        if (frame.getLocation().getX() != randScreenX || frame.getLocation().getY() != randScreenY) {
            Point finalPos = new Point();
            finalPos.setLocation(randScreenX, randScreenY);
            double XDistance = finalPos.getX() - frame.getLocation().getX();
            double YDistance = finalPos.getY() - frame.getLocation().getY();
            
            if (XDistance > 0 && XDistance > YDistance) {
                
                
            }
            for (int f = 0; f < 180; f++) {
                frame.setLocation((int)frame.getLocation().getX() + ((int)XDistance / 180), (int)frame.getLocation().getY() + ((int)YDistance) / 180);
                try {
                    Thread.sleep(1000/60);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return;
    }

    public void PetBehaviorFlying() {
        while (true) {
            double waitTime = (Math.random() * 1) + 1;
            try {
                Thread.sleep((long) (1000 * waitTime));
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            String[] petActions = {"walk", "special"};
            String action = petActions[(int)(Math.random() * petActions.length)];
            if (action == "walk") {
                PetMove();
            }
        }
    }
}