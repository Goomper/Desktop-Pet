import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import javax.swing.*;

public class test {

    JLabel label;
    JFrame frame;
    JPanel panel;
    int spinAmount = 1;
    LocalDateTime cooldown;
    LocalDateTime currentTime;

    public test() {

        frame = new JFrame();

        JButton spin = new JButton("Spin"); 
        JButton move = new JButton("Move");
        
        label = new JLabel("You have " + spinAmount + " spin left");

        panel = new JPanel();
        panel.setSize(400,400);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 50, 10));
        panel.add(spin);
        panel.add(label);
        panel.add(move);
        move.setLocation(50,20);
        
        ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("sprites\\1.png"));
        frame.setIconImage(logo.getImage());

        frame.setAlwaysOnTop(true);
        frame.setSize(400, 500);
        frame.setUndecorated(true);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SlotMachine");
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        
        move.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double randomX = Math.random() * (Toolkit.getDefaultToolkit().getScreenSize().getWidth());
                double randomY = Math.random() * (Toolkit.getDefaultToolkit().getScreenSize().getHeight());
                
                if (frame.getLocation().getX() != randomX && frame.getLocation().getY() != randomY) {
                    frame.getLocation().translate(200, 200);
                    Point finalPos = new Point();
                    finalPos.setLocation(randomX / 180, randomY / 180);
                    for (int i = 0; i < 180; i++) {
                        frame.setLocation((int)finalPos.getX() * i, (int)finalPos.getY() * i);
                        try {
                            Thread.sleep(1000/60);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        });
        
        spin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (spinAmount > 0) {
                    spinAmount = 1;
                    String Rarity = randomPet.randompet();
                        // Pets are identified in a way that the first number is the type
                        // (1 = ground, 2 = flying, 3 = ground and climbing)
                        // The second number defines the rarity
                        // (0-3, common, rare, epic, legendary)
                        // And last but not least the last number are the actual pet number.
                    if (Rarity == "GrCommon0") {
                        MultiThreadPets pets = new MultiThreadPets(1, 0, 0);
                        pets.start();
                        return;
                    } else if (Rarity == "GrCommon1") {
                        MultiThreadPets pets = new MultiThreadPets(1, 0, 1);
                        pets.start();
                        return;
                    } else if (Rarity == "GrCommon2") {
                        MultiThreadPets pets = new MultiThreadPets(1, 0, 2);
                        pets.start();
                        return;
                    } else if (Rarity == "GrCommon3") {
                        MultiThreadPets pets = new MultiThreadPets(1, 0, 3);
                        pets.start();
                        return;
                    } else if (Rarity == "GrCommon4") {
                        MultiThreadPets pets = new MultiThreadPets(1, 0, 4);
                        pets.start();
                        return;
                    }
                } else {
                    System.out.println("Not Enough Spins!");
                }
            }
        });
    }
}
