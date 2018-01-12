package hah.htetaunghlaing.news.viewholders;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.adapters.InternationalNewsPreviewAdapter;

/**
 * Created by Htet Aung Hlaing on 1/13/2018.
 */

public class ItemNewsInternationalViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.rv_international_news_item)
    RecyclerView recyclerView;

    private InternationalNewsPreviewAdapter internationalNewsPreviewAdapter;
    public ItemNewsInternationalViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this,itemView);


        internationalNewsPreviewAdapter = new InternationalNewsPreviewAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(internationalNewsPreviewAdapter);
    }
}
