package hu.szeged.szak1.mark.szak1;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;

/**
 * Created by Márk on 2014.08.17..
 */
public class Loginoutup extends AsyncTask<String, void, String> {

    Context context = null;

    public void AsyncTask<>{


    }

    private int logged = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (logged == 0){
            setContentView(R.layout.login);
            //logged = 1;
        }

        else if (logged == 1){
            setContentView(R.layout.logup);
        }


    }

}
