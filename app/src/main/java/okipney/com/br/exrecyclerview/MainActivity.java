package okipney.com.br.exrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = Arrays.asList("Texto 1", "Texto 2", "Texto 3");

        RecyclerView recyclerView = new RecyclerView(this, null, R.layout.simple_list_adapter);
        recyclerView.setAdapter(new SimpleListAdapter(list));
        //setContentView(recyclerView);

    }


}


