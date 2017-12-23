package hah.htetaunghlaing.news.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.delegates.NewsActionDelegates;

/**
 * Created by Htet Aung Hlaing on 12/3/2017.
 */

public class itemNewsViewHolders extends RecyclerView.ViewHolder {

    private  NewsActionDelegates rnewsActionDelegates;
    public itemNewsViewHolders(View itemView, NewsActionDelegates newsActionDelegates) {
        super(itemView);

        ButterKnife.bind(this, itemView);
        rnewsActionDelegates=newsActionDelegates;
    }


    @OnClick(R.id.cv_news_item_root)
    public void onViewItemTap(View view) {
       // Toast.makeText(view.getContext(),"News Item Clicker",Toast.LENGTH_SHORT).show();
            rnewsActionDelegates.onTapNewsItem();
    }

}
