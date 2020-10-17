/**
 * Objek Sequencer
 *
 * @author Faisal Reza 009
 * @version 1.0
 */

//sebuah sequencer mengatur Lalalin
//dia mengingat state mutakhir dari lampu
//setiap dia menerima pesan next, dia maju menuju state berikutnya dan-
//mengirimkan pesan yang sesuai ke lampu

public class Sequencer{
    //Lalalin yang diatur oleh sequencer ini
    private TrafficLight light;

    //merepresentasikan state-nya dengan int
    private final static int GO         = 0;//final artinya "one constant
    private final static int CAUTION    = 1;//variable per instance"
    private final static int STOP       = 2;

    private int currentState;

    //bangun sequencer untuk mengatur lalalin
    public Sequencer(TrafficLight light){
        this.light = light;
        this.currentState = GO;
        this.light.setGo();
    }

    //sekuennya adlh GO -> CAUTION -> STOP -> GO
    public void next(){
        switch(currentState){
            case GO:
                this.currentState = CAUTION;
                this.light.setCaution();
                break;

            case CAUTION:
                this.currentState = STOP;
                this.light.setStop();
                break;

            case STOP:
                this.currentState = GO;
                this.light.setGo();
                break;

            default: //ini tidak akan pernah terjadi
                System.err.println("What color is the light???");
        }
    }
}