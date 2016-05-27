package es.esy.kinketkuena.bbc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rncian_tentor extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rncian_tentor);
    }
    public  void bayar (View v){
        Intent intent = new Intent(this, Pembayaran.class);

        startActivity(intent);
    }
}
