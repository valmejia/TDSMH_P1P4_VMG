package mx.edu.tesoem.isc.tsdmh.tsdmh_p1p4_vmg;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SumaActivity extends AppCompatActivity {

    EditText txtn1, txtn2;
    TextView lblr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_suma);

        txtn1 = findViewById(R.id.txtn1);
        txtn2 = findViewById(R.id.txtn2);
        lblr = findViewById(R.id.lblr);

    }

    public void calcularSuma(View v) {
        int v1 = Integer.parseInt(txtn1.getText().toString());
        int v2 = Integer.parseInt(txtn2.getText().toString());
        lblr.setText("El resultado es: " + String.valueOf(v1+v2));
    }

}