package mx.edu.tesoem.isc.tsdmh.tsdmh_p1p4_vmg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

    }

    public void clickSuma(View v){
        Intent psuma = new Intent(this, SumaActivity.class);
        startActivity(psuma);
    }

    public void clickResta(View v){
        Intent presta = new Intent(this, RestaActivity.class);
        startActivity(presta);
    }

    public void clickMulti(View v){
        Intent pmulti = new Intent(this, MultiActivity.class);
        startActivity(pmulti);
    }

    public void clickDiv(View v){
        Intent pdiv = new Intent(this, DivActivity.class);
        startActivity(pdiv);
    }



}