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

public class MultiActivity extends AppCompatActivity {

    EditText mtxtn1, mtxtn2;
    TextView mlblr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multi);

        mtxtn1 = findViewById(R.id.mtxtn1);
        mtxtn2 = findViewById(R.id.mtxtn2);
        mlblr = findViewById(R.id.mlblr);

    }

    public void calcularMulti(View v) {
        int v1 = Integer.parseInt(mtxtn1.getText().toString());
        int v2 = Integer.parseInt(mtxtn2.getText().toString());
        mlblr.setText("El resultado es: " + String.valueOf(v1*v2));
    }

}