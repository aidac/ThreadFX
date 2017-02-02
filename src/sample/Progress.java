package sample;

/**
 * Created by aidas on 02/02/2017.
 */
public class Progress extends Thread {
    public void progress() {
        Controller cntr = new Controller();
        double progress = 0.0;
        for (double i = 0.0; i < 100.0; i++) {
            i = progress;
            progress++;
            cntr.progressBar.setProgress(progress);
        }
    }
}
