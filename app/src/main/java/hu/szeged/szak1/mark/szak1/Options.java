package hu.szeged.szak1.mark.szak1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Márk on 2014.08.17..
 */
public class Options extends Activity {

    Button loginoutup, option;
    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.option);
    }
}
