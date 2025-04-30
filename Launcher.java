import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launcher {
    public static void main(String[] args) {
        JFrame frame = new JFrame("XO Game Launcher");
        JButton localButton = new JButton("Play Local");
        JButton onlineButton = new JButton("Play Online");

        localButton.setBounds(100, 100, 200, 40);
        onlineButton.setBounds(100, 160, 200, 40);

        frame.add(localButton);
        frame.add(onlineButton);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        localButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new XOGameLocal(); // ينفتح الجيم المحلي
            }
        });

        onlineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new XOClientGUI(); // ينفتح الكلاينت اللي يلعب أونلاين
            }
        });
    }
}