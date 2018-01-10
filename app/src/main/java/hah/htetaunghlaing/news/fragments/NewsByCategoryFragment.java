package hah.htetaunghlaing.news.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.news.MMNewspp;
import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.adapters.newsAdapter;
import hah.htetaunghlaing.news.data.models.NewsModel;
import hah.htetaunghlaing.news.delegates.NewsActionDelegates;
import hah.htetaunghlaing.news.events.LoadedNewsEvent;


/**
 * Created by Htet Aung Hlaing on 1/9/2018.
 */

public class NewsByCategoryFragment extends Fragment implements NewsActionDelegates{

    @BindView(R.id.rv_news_by_category)
    RecyclerView rvNewsByCategory;

    private newsAdapter newsAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news_by_category,container,false);

        ButterKnife.bind(this,view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,true);
        rvNewsByCategory.setLayoutManager(linearLayoutManager);

        newsAdapter = new newsAdapter(this);
        rvNewsByCategory.setAdapter(newsAdapter);
        NewsModel.getsObjectInstance().loadNews();

        return view;
    }

    @Override
    public void onTapNewsItem() {

    }

    @Override
    public void onTapCommentButton() {

    }

    @Override
    public void onTapSentToButton() {

    }

    @Override
    public void onTapFavouriteButton() {

    }
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNewsLoaded(LoadedNewsEvent event){

        Log.d(MMNewspp.LOG_TAG,"onNewsLoaded  :"+event.getNewsList().size());
        newsAdapter.setNews(event.getNewsList());
    }
}
