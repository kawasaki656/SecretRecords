package r1.secretrecord;

import android.os.AsyncTask;

import java.util.concurrent.TimeUnit;

/**
 * Created by kawasaki-PC on 29.09.2016.
 */
public class ChangeMomentTask extends AsyncTask<Void,Void,Void> {

    @Override
    protected Void doInBackground(Void... params) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        State.moment = 1;
        return null;
    }
}
