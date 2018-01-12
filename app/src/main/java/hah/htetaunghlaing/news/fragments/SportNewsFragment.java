package hah.htetaunghlaing.news.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.adapters.SportNewsAdapter;
import hah.htetaunghlaing.news.viewholders.ItemSportNewsViewHolder;

/**
 * Created by Htet Aung Hlaing on 1/10/2018.
 */

public class SportNewsFragment extends Fragment {

    @BindView(R.id.rv_sport_news)
    RecyclerView recyclerView;

    private SportNewsAdapter sportNewsAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sport_news,container,false);

        ButterKnife.bind(this,view);

        sportNewsAdapter = new SportNewsAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(sportNewsAdapter);
        return  view;
    }
}
