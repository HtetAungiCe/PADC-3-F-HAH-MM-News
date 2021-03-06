package hah.htetaunghlaing.news.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hah.htetaunghlaing.news.R;
import hah.htetaunghlaing.news.viewitems.ImageInNewsDetailsViewItem;

/**
 * Created by Htet Aung Hlaing on 12/10/2017.
 */

public class ImagesInNewsDetailsAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 7;
    }

    public ImagesInNewsDetailsAdapter() {
        super();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Context context = container.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ImageInNewsDetailsViewItem view = (ImageInNewsDetailsViewItem) inflater.inflate(R.layout.item_news_details_images, container, false);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
      container.removeView((View)object);

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
       /* if(object instanceof View)
            return true;
        else
            return false;*/

        //return object instanceof View;
        return (view == (View) object);
    }
}
