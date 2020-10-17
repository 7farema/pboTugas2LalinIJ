/**
 * Objek Utama LaLaLin
 *
 * @author Faisal Reza 009
 * @version 1.0
 */

import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class TrafficLight extends Panel{//extends artinya 'adalah'
    //buat 3 lampu/ lensa dan sebuah tombol
    private Lens red            = new Lens (Color.red);
    private Lens yellow         = new Lens (Color.yellow);
    private Lens green          = new Lens (Color.green);
    private Button nextButton   = new Button("Next");

    //bangun sebuah lalalin
    public TrafficLight(){
        this.setLayout(new BorderLayout());

        //buat panel untuk lampu
        Panel lensPanel = new Panel();
        lensPanel.setLayout(new GridLayout(3,1));
        lensPanel.add(red);
        lensPanel.add(yellow);
        lensPanel.add(green);
        this.add(BorderLayout.NORTH, lensPanel);

        //atur tombol next
        Sequencer sequencer = new Sequencer(this);
        NextButtonListener payAttention = new NextButtonListener(sequencer);
        nextButton.addActionListener(payAttention);
        this.add(BorderLayout.CENTER,nextButton);
    }

    //metode yang mengubah lampu

    //jadikan lampu merah
    public void setStop(){
        red.turnOn();
        yellow.turnOff();
        green.turnOff();
    }

    //jadikan kuning
    public void setCaution(){
        red.turnOff();
        yellow.turnOn();
        green.turnOff();
    }

    //jadi hijau
    public void setGo(){
        red.turnOff();
        yellow.turnOff();
        green.turnOn();
    }

    //simulasi lalalin dimulai di main, @param args: diabaikan
    public static void main(String[] args){
        Frame frame         = new Frame();
        TrafficLight light  = new TrafficLight();
        frame.add(light);
        frame.addWindowListener(new ShutDownLight());
        frame.pack();
        frame.show();
    }

    //sebuah instansi ShutDownLight memegang event menutup yang dihasilkan
    //oleh sistem jendela di bawahnya

    ///ini adalah sebuah 'inner class', dideklarasikan di dalam class TrafficLight
    //karena dia hanya digunakan di sini
    private static class ShutDownLight extends WindowAdapter{

        //tutup jendela dengan mematikan lampu
        public void windowClosing (WindowEvent e){
            System.exit(0);
        }
    }
}
