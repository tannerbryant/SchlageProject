package com.example.schlageproject;

import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class GetLockState {

    private String id;
    private String key;
    private String url = "https://api.allegion.com/schlage-home/api/Devices/";
    String query = null;
    InputStream response = null;
    String responseBody = null;

    public GetLockState(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public String getStatus() throws IOException {
        URLConnection connection = new URL(url + key).openConnection();
        connection.setRequestProperty("Authoriztion", "Bearer {Auth Token}");
        connection.setRequestProperty("alle-subscription-key", key);
        response = connection.getInputStream();

        if(response != null) {
            try(Scanner scanner = new Scanner(response)) {
                responseBody = scanner.useDelimiter("\\A").next();
                Log.d("Response Body", responseBody);
            }
            return responseBody;
        }
        return null;
    }
}
