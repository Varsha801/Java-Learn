import javax.swing.*;
import java.awt.*;

public class CheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);

        JCheckBox checkBox = new JCheckBox();

        ImageIcon customIcon = new ImageIcon("no.png");
        int width = 32; // Desired width
        int height = 32; // Desired height

        Image image = customIcon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        checkBox.setIcon(resizedIcon);

        frame.add(checkBox);
        frame.setVisible(true);
    }
}

