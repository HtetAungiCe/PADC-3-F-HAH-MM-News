package hah.htetaunghlaing.news.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.viewholders.ItemSportNewsViewHolder;

/**
 * Created by Htet Aung Hlaing on 1/12/2018.
 */

public class SportNewsAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemSportNewsViewHolder itemSportNewsViewHolder = new ItemSportNewsViewHolder
                (inflater.inflate(R.layout.item_sport_news,parent,false));
        return itemSportNewsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
