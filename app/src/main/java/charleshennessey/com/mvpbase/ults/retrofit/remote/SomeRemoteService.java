package charleshennessey.com.mvpbase.ults.retrofit.remote;

import charleshennessey.com.mvpbase.ults.retrofit.server_response.SomeJsonToPojoFile;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ceh024 on 9/5/17.
 *
 * Example retrofit service
 */

public interface SomeRemoteService {
    /**
     * Example: vehicles/getmodelsformakeyear/make/honda/modelyear/2015?format=json
     * @param query
     * @return
     */
    @GET("{query}?format=json")
    Call<SomeJsonToPojoFile> getAnswers(@Path(value = "query", encoded = true) String query);
}
