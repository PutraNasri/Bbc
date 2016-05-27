package es.esy.kinketkuena.bbc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mtk extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtk);
    }
    public  void fadhli(View v){
        Intent intent = new Intent(this, rncian_tentor.class);

        startActivity(intent);
    }
}
