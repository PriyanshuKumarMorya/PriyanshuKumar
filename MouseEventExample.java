package PriyanshuFrameclassCrate;


import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class MouseEventExample extends JFrame implements MouseListener {
    JLabel label;

    public MouseEventExample() {
        // Frame setup
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create and add a label
        label = new JLabel("Interact with the window using your mouse!");
        add(label);

        // Add mouse listener to the frame
        addMouseListener(this);

        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {

        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {

        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {

        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {

        label.setText("Mouse Entered the frame");
    }

    public void mouseExited(MouseEvent e) {

        label.setText("Mouse Exited the frame");
    }

    public static void main(String[] args) {

        new MouseEventExample();
    }
}
