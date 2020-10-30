package com.example.pc_amr.retrofit_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.pc_amr.retrofit_1.repo.MyApiEndPointInterface;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();
    private RecyclerView mRecycleView = null;
    private UserAdapter mAdapter = null;
    List<User.ItemsEntry> Users = null;
    private RecyclerView.LayoutManager mLayoutManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

        String API_BASE_URL = this.getResources().getString(R.string.BASE_URL);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit.Builder builder =
                new Retrofit.Builder()
                        .baseUrl(API_BASE_URL)
                        .addConverterFactory(
                                GsonConverterFactory.create()
                        );

        Retrofit retrofit =
                builder
                        .client(
                                httpClient.build()
                        )
                        .build();

        MyApiEndPointInterface client =  retrofit.create(MyApiEndPointInterface.class);

        ////////////////////////////////////


        // Create a very simple REST adapter which points the GitHub API endpoint.
        client = retrofit.create(MyApiEndPointInterface.class);

// Fetch a list of the Github repositories.
        Call<User> call =
                client.getRepo("fs-opensource");

// Execute the call asynchronously. Get a positive or negative callback.
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                // The network call was a success and we got a response
                // TODO: use the repository list and display it
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                // the network call was a failure
                // TODO: handle error
            }
        });

    }
}
