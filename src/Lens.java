/**
 * Objek Lampu
 *
 * @author Faisal Reza 009
 * @version 1.0
 */

import java.awt.*;

//lensa/ lampu memiliki warna tertentu dan bisa dimatikan (warna hitam)

public class Lens extends Canvas{
    private Color onColor;
    private Color offColor = Color.black;
    private Color currentColor;

    private final static int SIZE = 100; //ukuran lampu
    private final static int OFFSET = 20; //offset lampu

    //bangun lampunya, @param color: warna lampu saat dinyalakan
    public Lens(Color color){
        this.setBackground(Color.black);
        this.onColor = color;
        this.setSize(SIZE, SIZE);
        this.turnOff();
    }

    //@param g: objek grafik untuk mengatur kuas dan informasi warna
    public void paint(Graphics g){
        g.setColor(this.currentColor);
        g.fillOval(OFFSET,OFFSET,SIZE-OFFSET*2,SIZE-OFFSET*2);
    }

    //buat lampu ini menampilkan warnanya
    public void turnOn(){
        currentColor = onColor;
        this.repaint();
    }

    //buat lampu ini mati
    public void turnOff(){
        currentColor = offColor;
        this.repaint();
    }
}