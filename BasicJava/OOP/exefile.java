import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class exefile extends JPanel {

    public void paint(Graphics g) {
        // Cast Graphics object to Graphics2D to enable anti-aliasing
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for anti-aliasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set color to blue
        g2d.setColor(Color.BLUE);

        // Draw "Hello" in blue color
        g2d.drawString("Sarthak", 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BlueHello");
        frame.add(new exefile());
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
