package hah.htetaunghlaing.news.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.data.vo.NewsVO;
import hah.htetaunghlaing.news.delegates.NewsActionDelegates;

/**
 * Created by Htet Aung Hlaing on 12/3/2017.
 */

public class itemNewsViewHolders extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_publication_title)
    TextView tvPublicationTitle;

    @BindView(R.id.tv_posted_date)
    TextView tvPostedDate;

    @BindView(R.id.tv_news_brief)
    TextView tvNewsBrief;


    @BindView(R.id.iv_publication_logo)
    ImageView ivPublicationLogo;

    @BindView(R.id.iv_news_post1)
    ImageView ivNewsPost;

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
    public void setNews(NewsVO news){
        tvPublicationTitle.setText(news.getPublication().getTitle());
        tvPostedDate.setText(news.getPostedDate());
        tvNewsBrief.setText(news.getBrief());

        Glide.with(ivPublicationLogo.getContext())
                .load(news.getPublication().getLogo())
               .into(ivPublicationLogo);


        if(news.getImages() != null) {
            ivNewsPost.setVisibility(View.VISIBLE);
            Glide.with(ivNewsPost.getContext())
                    .load(news.getImages().get(0))
                    .into(ivNewsPost);
        }else {
            ivNewsPost.setVisibility(View.GONE);
        }
    }

}
