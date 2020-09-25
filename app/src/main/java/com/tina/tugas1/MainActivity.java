package com.tina.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtNama,txtnpm,txtprodi,txtfakultas, txtalamat,txtnohp,txthoby,txtTtl;
    EditText edtNpm, edtNama ,edtprodi,edtfakultas, edtalamat,edtnohp,edthoby,edtTtl;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtnpm = (TextView) findViewById(R.id.txtnpm);
        txtprodi = (TextView) findViewById(R.id.txtprodi);
        txtfakultas = (TextView) findViewById(R.id.txtfakultas);
        txtalamat = (TextView) findViewById(R.id.txtalamat);
        txtnohp = (TextView) findViewById(R.id.txtnohp);
        txthoby = (TextView) findViewById(R.id.txthoby);
        txtTtl = (TextView) findViewById(R.id.txtTtl);

        edtNpm = (EditText) findViewById(R.id.Npm);
        edtNama = (EditText) findViewById(R.id.Nama);
        edtprodi= (EditText) findViewById(R.id.prodi);
        edtfakultas = (EditText) findViewById(R.id.fakultas);
        edtalamat = (EditText) findViewById(R.id.alamat);
        edtnohp = (EditText) findViewById(R.id.nohp);
        edthoby= (EditText) findViewById(R.id.hobby);
        edtTtl = (EditText) findViewById(R.id.Ttl);


        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strprodi = edtprodi.getText().toString();
                String strfakultas = edtfakultas.getText().toString();
                String stralamat = edtalamat.getText().toString();
                String strnohp = edtnohp.getText().toString();
                String strhoby = edthoby.getText().toString();
                String strTtl = edtTtl.getText().toString();

                txtNama.setText("" + strNama);
                txtnpm.setText("" +strNpm);
                txtprodi.setText("" + strprodi);
                txtfakultas.setText("" +strfakultas);
                txtalamat.setText("" + stralamat);
                txtnohp.setText("" +strnohp);
                txthoby.setText("" + strhoby);
                txtTtl.setText("" +strTtl);
            }
        });
    }
}