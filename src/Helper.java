import java.util.TimerTask;

public class Helper extends TimerTask {//extends artinya adalah
    private Sequencer sequencer;

    public Helper(Sequencer sequencer){
        this.sequencer = sequencer;
    }

    public void run(){
        this.sequencer.next();
    }
}