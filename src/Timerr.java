/**
 * Timer Next
 *
 * @author Faisal Reza 009
 * @version 1.0
 */

import java.util.Timer;
import java.util.TimerTask;

class Helper extends TimerTask{
    private Sequencer sequencer;
    public void run(){
        this.sequencer.next();
    }
}

public class Timerr{
    public static void main(String[] args)
    {

        Timer timer = new Timer();
        TimerTask task = new Helper();

        timer.schedule(task, 5000, 1000);

    }
}