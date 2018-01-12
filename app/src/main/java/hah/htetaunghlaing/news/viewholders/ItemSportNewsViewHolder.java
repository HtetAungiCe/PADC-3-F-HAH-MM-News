package hah.htetaunghlaing.news.viewholders;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.adapters.SportNewsPreviewAdapter;

/**
 * Created by Htet Aung Hlaing on 1/12/2018.
 */

public class ItemSportNewsViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.rv_sport_news_items)
    RecyclerView recyclerView;


    private SportNewsPreviewAdapter sportNewsPreviewAdapter = new SportNewsPreviewAdapter();

    public ItemSportNewsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(sportNewsPreviewAdapter);
    }
}
