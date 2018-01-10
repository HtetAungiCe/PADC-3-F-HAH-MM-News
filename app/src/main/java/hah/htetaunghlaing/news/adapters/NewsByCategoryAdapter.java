package hah.htetaunghlaing.news.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Htet Aung Hlaing on 1/9/2018.
 */

public class NewsByCategoryAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragments;
    private List<String>  mTabTitle;

    public NewsByCategoryAdapter(FragmentManager fm) {
        super(fm);

        mFragments = new ArrayList<>();
        mTabTitle = new ArrayList<>();

    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitle.get(position);
    }

    public void addTab(String tabTitle, Fragment fragment){
        mTabTitle.add(tabTitle);
        mFragments.add(fragment);
        notifyDataSetChanged();

    }
}
