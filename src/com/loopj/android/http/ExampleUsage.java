package com.loopj.android.http;
import android.util.Log;

import com.loopj.android.http.*;

public class ExampleUsage {
    public static void makeRequest() {
        AsyncHttpClient client = new AsyncHttpClient();

        client.get("http://www.google.com", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String response) {
                System.out.println(response);
                Log.e("debug","onSuccess");
            }
        });
    }
}