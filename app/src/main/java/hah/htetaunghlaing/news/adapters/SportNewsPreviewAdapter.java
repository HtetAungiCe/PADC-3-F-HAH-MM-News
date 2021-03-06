package hah.htetaunghlaing.news.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.viewholders.ItemSportNewsPreview;

/**
 * Created by Htet Aung Hlaing on 1/12/2018.
 */

public class SportNewsPreviewAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_sport_news_preview,parent,false);
        ItemSportNewsPreview itemSportNewsPreview = new ItemSportNewsPreview(view);
        return itemSportNewsPreview;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
