package id.poliban.ac.mi.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = findViewById(R.id.etNama);
        Button btTampilkan = findViewById(R.id.btTampilkan);

        btTampilkan.setOnClickListener( v ->
                Toast.makeText(this,"Selamat datang..."+ etNama.getText().toString()
                ,Toast.LENGTH_LONG).show());
    }
}
