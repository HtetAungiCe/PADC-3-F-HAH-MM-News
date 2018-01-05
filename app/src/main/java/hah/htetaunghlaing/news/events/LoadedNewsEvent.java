package hah.htetaunghlaing.news.events;

import java.util.List;

import hah.htetaunghlaing.news.data.vo.NewsVO;

/**
 * Created by Htet Aung Hlaing on 1/2/2018.
 */

public class LoadedNewsEvent {

    private List<NewsVO> newsList;

    public LoadedNewsEvent(List<NewsVO> newsList) {
        this.newsList = newsList;
    }

    public List<NewsVO> getNewsList() {
        return newsList;
    }
}
