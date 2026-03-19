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

public class DivActivity extends AppCompatActivity {
    EditText dtxtn1, dtxtn2;
    TextView dlblr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);

        dtxtn1 = findViewById(R.id.dtxtn1);
        dtxtn2 = findViewById(R.id.dtxtn2);
        dlblr = findViewById(R.id.dlblr);

    }

    public void calcularDiv(View v) {
        int v1 = Integer.parseInt(dtxtn1.getText().toString());
        int v2 = Integer.parseInt(dtxtn2.getText().toString());
        dlblr.setText("El resultado es: " + String.valueOf(v1/v2));
    }
}