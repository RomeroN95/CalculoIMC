package cl.rom.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btCalcular;
    private EditText Peso, Altura;
    private  Float floatResultado;
    private  Float intPeso, intAltura;
    private TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Peso =(EditText) findViewById(R.id.plPeso);
        Altura =(EditText) findViewById(R.id.ptAltura);
        btCalcular=(Button) findViewById(R.id.btCalcular);
        Resultado=(TextView) findViewById(R.id.tvResultado);

        final Context context = getApplicationContext();
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intPeso = Float.parseFloat(String.valueOf(Peso.getText()));
                intAltura = Float.parseFloat (String.valueOf(Altura.getText()));

                floatResultado = Float.valueOf(intPeso/(intAltura*intAltura));
                Resultado.setText("Resultado IMC: "+floatResultado);

                //Toast mensaje = Toast.makeText(context, "Mi Imc Peso: "+intPeso+"Altura "+intAltura,Toast.LENGTH_SHORT);
                Toast mensaje = Toast.makeText(context, "Mi Imc es: "+floatResultado,Toast.LENGTH_SHORT);
                //mensaje.show();
            }
        });

    }
}