package signos.cursoandroid.junio.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listaSignos;

    private String[] signos = {
        "Aries", "Touros", "Gemeos", "Cancer", "Leao", "Virgem",
        "Libra", "Escorpiao", "Sagitario", "Capricornio", "Aquario", "Peixes"
    };

    private String[] perfis = {
            "Aries", "Touros", "Gemeos", "Cancer", "Leao", "Virgem",
            "Libra", "Escorpiao", "Sagitario", "Capricornio", "Aquario", "Peixes"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listviewid);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), perfis[position], Toast.LENGTH_LONG).show();
            }
        });

    }
}
