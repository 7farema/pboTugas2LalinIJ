/**
 * Pendengar Tombol Next
 *
 * @author Faisal Reza 009
 * @version 1.0
 */

import java.awt.event.*;

public class NextButtonListener implements ActionListener{
    //utk mengakses interface ActionListener

    private Sequencer sequencer;

    //bangun pendengar yang akan mendengarkan input next
    //@param event: event yang dideteksi di tombol
    public NextButtonListener (Sequencer sequencer){
        this.sequencer = sequencer;
    }

    //aksi yang dilakukan ketika tombol ditekan
    //kirim pesan ke sequencer untuk mendorongnya ke state selanjutnya
    //@param event: event yang dideteksi di tombol
    public void actionPerformed(ActionEvent event){
        this.sequencer.next();
    }
}