package PriyanshuFrameclassCrate;

import java.awt.Frame;

public class AwtExample1 extends Frame {
    public AwtExample1(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("Priyanshu Kumar");
    }

    public static void main(String[] args) {
        AwtExample1 t = new AwtExample1();
        t.setTitle("Priyanshu");


    }
}
