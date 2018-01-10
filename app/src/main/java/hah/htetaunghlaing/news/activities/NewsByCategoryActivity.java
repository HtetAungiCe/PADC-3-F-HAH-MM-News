package hah.htetaunghlaing.news.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.adapters.NewsByCategoryAdapter;
import hah.htetaunghlaing.news.fragments.InternationalNewsFragment;
import hah.htetaunghlaing.news.fragments.NewsByCategoryFragment;
import hah.htetaunghlaing.news.fragments.SportNewsFragment;

/**
 * Created by Htet Aung Hlaing on 1/9/2018.
 */


public class NewsByCategoryActivity extends AppCompatActivity {

    @BindView(R.id.tool_bar)
    Toolbar toolbar;

    @BindView(R.id.vp_news_by_category)
    ViewPager vpNewsByCategory;

    @BindView(R.id.tb_news_by_category)
    TabLayout tbNewsByCategory;
    private NewsByCategoryAdapter mNewsByCategoryAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_by_category);

        ButterKnife.bind(this, this);


        setSupportActionBar(toolbar);

        if (toolbar != null) {
            getSupportActionBar().setTitle(R.string.news_by_category_title);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_24dp);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        mNewsByCategoryAdapter = new NewsByCategoryAdapter(getSupportFragmentManager());
        vpNewsByCategory.setAdapter(mNewsByCategoryAdapter);

        mNewsByCategoryAdapter.addTab("Local News",new NewsByCategoryFragment());
        mNewsByCategoryAdapter.addTab("International News",new InternationalNewsFragment());
        mNewsByCategoryAdapter.addTab("Sport News",new SportNewsFragment());


        tbNewsByCategory.setupWithViewPager(vpNewsByCategory);

        vpNewsByCategory.setOffscreenPageLimit(mNewsByCategoryAdapter.getCount());
    }
}
