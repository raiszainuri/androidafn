package com.afn.afnapp.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.afn.afnapp.R;
import com.afn.afnapp.activity.AlQuranFeature.IsiDariSurahActivity;
import com.afn.afnapp.model.AyahModel;
import com.afn.afnapp.model.SurahNameModel;

import java.util.List;

public class AyahRAdapter extends RecyclerView.Adapter<AyahRAdapter.MyViewHolder> {
    private List<AyahModel> mDataset;
    private Activity actNa;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvNoAyah, tvIsiAyah, tvArtiAyah;
        public RelativeLayout rlMain,rl1,rl2;

        public MyViewHolder(View v) {
            super(v);
            tvNoAyah = v.findViewById(R.id.tvNoAyah);
            tvIsiAyah = v.findViewById(R.id.tvIsiAyah);
            tvArtiAyah = v.findViewById(R.id.tvArtiAyah);
            rl1 = v.findViewById(R.id.rl1);
            rl2 = v.findViewById(R.id.rl2);

            rlMain = v.findViewById(R.id.rlMain);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AyahRAdapter(Activity act, List<AyahModel> myDataset) {
        mDataset = myDataset;
        actNa = act;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AyahRAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_ayah, parent, false);
        // create a new view
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final AyahModel fm = mDataset.get(position);
        if (fm.getNoAyah() == 0){
            holder.rl1.setVisibility(View.VISIBLE);
        }else{
            holder.rl2.setVisibility(View.VISIBLE);
            if ((fm.getNoAyah() % 2) == 0) {
                holder.rlMain.setBackgroundColor(actNa.getResources().getColor(R.color.color1));
            } else {
                holder.rlMain.setBackgroundColor(actNa.getResources().getColor(R.color.color2));
            }
            holder.tvNoAyah.setText(fm.getNoAyah() + "");
            holder.tvIsiAyah.setText((fm.getAyah()));
            holder.tvArtiAyah.setText(Html.fromHtml(fm.getAyahTranslate()));
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}