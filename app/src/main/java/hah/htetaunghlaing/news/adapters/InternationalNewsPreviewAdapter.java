package hah.htetaunghlaing.news.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.viewholders.ItemNewsInternationalPreviewViewHolder;

/**
 * Created by Htet Aung Hlaing on 1/13/2018.
 */

public class InternationalNewsPreviewAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemNewsInternationalPreviewViewHolder itemNewsInternationalPreviewViewHolder = new ItemNewsInternationalPreviewViewHolder
                (inflater.inflate(R.layout.item_international_news_preview,parent,false));
        return itemNewsInternationalPreviewViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
