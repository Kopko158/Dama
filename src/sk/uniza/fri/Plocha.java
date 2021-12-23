package sk.uniza.fri;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;

/**
 * 8.12.2021 - 18:53
 *
 * @author Andrej
 */
public class Plocha {


    private JPanel[][] pole = new JPanel[8][8];

    public Plocha() {
        JFrame frame = new JFrame("Aplikacia");
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(8, 8));

        for (int i = 0; i < 8; i++) {
            for (int y = 0; y < 8; y++) {
                this.pole[i][y] = new JPanel();

                if ((i + y) % 2 == 0) {
                    this.pole[i][y].setBackground(Color.black);
                } else {
                    this.pole[i][y].setBackground(Color.white);
                }
            }
            pole[i][y].add(frame);
        }

    }

}