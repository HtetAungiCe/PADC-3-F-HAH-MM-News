package hah.htetaunghlaing.news.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.data.vo.NewsVO;
import hah.htetaunghlaing.news.delegates.NewsActionDelegates;
import hah.htetaunghlaing.news.viewholders.itemNewsViewHolders;

/**
 * Created by Htet Aung Hlaing on 12/3/2017.
 */

public class newsAdapter extends RecyclerView.Adapter<itemNewsViewHolders> {

  private NewsActionDelegates rnewsActionDelegates;
  private List<NewsVO> mNewsList;

    public newsAdapter(NewsActionDelegates newsActionDelegates) {
       rnewsActionDelegates = newsActionDelegates;
        mNewsList = new ArrayList<>();
    }

    @Override
    public itemNewsViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsItemView = inflater.inflate(R.layout.item_news,parent,false);
        itemNewsViewHolders itemNewsViewHolder = new itemNewsViewHolders(newsItemView,rnewsActionDelegates);
        return itemNewsViewHolder;

    }

    @Override
    public void onBindViewHolder(itemNewsViewHolders holder, int position) {

        holder.setNews(mNewsList.get(position));

    }

    @Override
    public int getItemCount() {
        //recyelerview mhar pya pay mae coungt
        return mNewsList.size();
    }

    public void setNews(List<NewsVO> newsList){
        mNewsList = newsList;
        notifyDataSetChanged();
    }
}