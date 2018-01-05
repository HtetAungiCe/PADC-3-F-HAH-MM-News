package hah.htetaunghlaing.news.data.models;

import hah.htetaunghlaing.news.network.HttpUrlConnectionDataAgent;
import hah.htetaunghlaing.news.network.NewsDataAgent;

/**
 * Created by Htet Aung Hlaing on 12/23/2017.
 */

public class NewsModel {
    private static NewsModel sObjectInstance;

    private NewsDataAgent nDataAgent;

    private NewsModel(){

        nDataAgent= HttpUrlConnectionDataAgent.getsObjInstance();

    }
    public static NewsModel getsObjectInstance(){
        if(sObjectInstance==null){
            sObjectInstance=new NewsModel();
        }
        return sObjectInstance;
    }

    /**
     * NetWork layer api ka news tway ko load lot phot
     */
    public void loadNews(){
        nDataAgent.loadNews();
    }
}
//Singleton Design pattern set up