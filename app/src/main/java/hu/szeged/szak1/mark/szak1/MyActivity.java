package hu.szeged.szak1.mark.szak1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;


public class MyActivity extends Activity {

    ImageButton options, loginoutup;
    EditText search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        options = (ImageButton) findViewById(R.id.options);
        loginoutup = (ImageButton) findViewById(R.id.loginoutup);
        search = (EditText) findViewById(R.id.search);

        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, Options.class);
                startActivity(intent);
                finish();
            }
        });

        loginoutup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this,Loginoutup.class);
                startActivity(intent);
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //kidolgozásra vár SQLite egyenlőre(dbhelper stb.)
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
