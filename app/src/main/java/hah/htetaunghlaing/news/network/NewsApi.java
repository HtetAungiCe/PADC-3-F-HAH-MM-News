package hah.htetaunghlaing.news.network;

import hah.htetaunghlaing.news.network.responses.GetNewsResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Htet Aung Hlaing on 1/9/2018.
 */

public interface NewsApi {
    @FormUrlEncoded
    @POST("getMMNews.php")
    Call<GetNewsResponse> loadNews(@Field("page") int page,
                                   @Field("access_token") String accessToken);
}
