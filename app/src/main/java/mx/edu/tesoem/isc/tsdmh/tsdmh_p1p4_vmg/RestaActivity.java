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

public class RestaActivity extends AppCompatActivity {

    EditText rtxtn1, rtxtn2;
    TextView rlblr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resta);

        rtxtn1 = findViewById(R.id.rtxtn1);
        rtxtn2 = findViewById(R.id.rtxtn2);
        rlblr = findViewById(R.id.rlblr);

    }

    public void calcularResta(View v) {
        int v1 = Integer.parseInt(rtxtn1.getText().toString());
        int v2 = Integer.parseInt(rtxtn2.getText().toString());
        rlblr.setText("El resultado es: " + String.valueOf(v1-v2));
    }
}