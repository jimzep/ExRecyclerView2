package okipney.com.br.exrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = Arrays.asList("21", "25", "19", "32", "35", "31", "22", "44", "23", "51");
        mRecyclerView = (RecyclerView) findViewById(R.id.mRecyclerview);
        mRecyclerView.setAdapter(new SimpleListAdapter(list));
        mRecyclerView.setHasFixedSize(false);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(lm);
    }


}


