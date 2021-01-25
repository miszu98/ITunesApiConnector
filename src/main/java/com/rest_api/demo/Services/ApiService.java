package com.rest_api.demo.Services;

import com.rest_api.demo.Models.Track;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApiService {

    private HttpResponse<String> connectToApi(String link) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(link)).build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException | IOException e) {
            System.out.println("blad");
        }
        return response;
    }

    public Track getTracksByAuthor(String author, int limit) {
        HttpResponse<String> response = connectToApi(String.format("https://itunes.apple.com/search?term=%s&limit=%d", author, limit));
        JSONObject jsonObject = new JSONObject(response.body());
        List<List<String>> tracks = new ArrayList<>();

        for (int i=0; i<limit; i++) {
            JSONObject record = (JSONObject) jsonObject.getJSONArray("results").get(i);
            tracks.add(Arrays.asList(record.getString("trackName"), record.getString("trackViewUrl")));
        }

        return new Track(author, tracks);
    }
}
