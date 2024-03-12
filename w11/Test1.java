import java.awt.*;
import javax.swing.*;
public class Test1 {
public static void main(String[ ] args) {
 JFrame frame = new JFrame("My Frame");
 frame.add(new JButton("cancel"));
 frame.add(new JButton("Ok"));
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(200, 200);
 frame.setVisible(true);
}
} 