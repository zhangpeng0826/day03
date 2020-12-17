package com.example.app2.api;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;

public interface ApiService {
    @GET()
    Observable<ResponseBody> get();
}
