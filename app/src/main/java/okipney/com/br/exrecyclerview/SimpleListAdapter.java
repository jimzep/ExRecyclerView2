package okipney.com.br.exrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ronaldo on 18/05/2016.
 */
public class SimpleListAdapter extends RecyclerView.Adapter<SimpleListAdapter.ViewHolder> {


    private List<String> mValues;


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.simple_list_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String text = mValues.get(position);
        holder.mTextView.setText(text);
    }

    @Override
    public int getItemCount() {
        return this.mValues.size();
    }


    /*
        Constructor do SimpleListAdapter
     */
    public SimpleListAdapter(List<String> items) {
        this.mValues = items;
    }


    //--------------------------------------------------
    // View Holder
    //--------------------------------------------------

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(View view) {
            super(view);
            mTextView = (TextView) view.findViewById(R.id.id_adapter_simple_list__text_view);
        }
    }

}
