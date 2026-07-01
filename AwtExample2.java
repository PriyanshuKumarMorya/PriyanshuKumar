package PriyanshuFrameclassCrate;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.Frame;

public class AwtExample2 extends JFrame{
    AwtExample2(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("Priyanshu");

        Color c = Color.red;
        this.setBackground(c);
        this.addWindowListener(new java.awt.event.WindowAdapter(){public void windowClosing(java.awt.event.WindowEvent e){

            System.exit(0);
        }});
    }
    public static void main(String[] args) {
        AwtExample2 t = new AwtExample2();

    }
}
