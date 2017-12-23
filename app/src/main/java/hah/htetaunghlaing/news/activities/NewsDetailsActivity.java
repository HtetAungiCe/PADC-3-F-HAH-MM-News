package hah.htetaunghlaing.news.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ViewParent;


import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.adapters.ImagesInNewsDetailsAdapter;

/**
 * Created by Htet Aung Hlaing on 12/9/2017.
 */

public class NewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.tb_news_deatals)
    Toolbar toolBarNewsDetails;

    @BindView(R.id.vp_news_details_images)
    ViewPager vpNewsDetailsImages;

    private ImagesInNewsDetailsAdapter mImagesInNewsDetailsAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        ButterKnife.bind(this,this);


        mImagesInNewsDetailsAdapter=new ImagesInNewsDetailsAdapter();
        vpNewsDetailsImages.setAdapter(mImagesInNewsDetailsAdapter);
        /*setSupportActionBar(toolBarNewsDetails);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);*/
    }
}