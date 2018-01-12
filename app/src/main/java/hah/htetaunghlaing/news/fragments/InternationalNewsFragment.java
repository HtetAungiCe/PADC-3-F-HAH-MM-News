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
import hah.htetaunghlaing.news.adapters.InternationalNewsAdapter;

/**
 * Created by Htet Aung Hlaing on 1/10/2018.
 */

public class InternationalNewsFragment extends Fragment{
    @BindView(R.id.rv_news_international)
    RecyclerView recyclerView;

    private InternationalNewsAdapter internationalNewsAdapter = new InternationalNewsAdapter();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_international_news,container,false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);ButterKnife.bind(this,view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(internationalNewsAdapter);
        return view;
    }
}
