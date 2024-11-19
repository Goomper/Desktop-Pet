import java.awt.Color;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class special {
    

    public void PetSpecialManager(int type, int rarity, int id, Point pos) {
        if (rarity == 0) {
            PetSpecialSummon(type, rarity, id, pos);
        }
    }

    public void PetSpecialSummon(int type, int rarity, int id, Point pos) {

        JFrame frame;
        JPanel panel;

        frame = new JFrame();
        panel = new JPanel();
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

        if (rarity == 0 && id == 2) {
            double rand = Math.random();
            ImageIcon image1 = new ImageIcon("sprites\\Cool_Bone.gif");
            frame.add(new JLabel(image1));

            Point moveToo = new Point();
            if (rand > 0.5) {
                moveToo = new Point(2000, (int)pos.getY());
            } else {
                moveToo = new Point(-2000, (int)pos.getY());
            }
            frame.setLocation(pos);
            for (int i = 1; i < 360; i++) {
                frame.setVisible(true);
                frame.setLocation((int)frame.getLocation().getX() + (int)moveToo.getLocation().getX() / 360, (int)frame.getLocation().getY());
                try {
                    Thread.sleep(1000/60);
                } catch (InterruptedException e1) {
                }
            }
            frame.dispose();
        }
    }
}