package com.geekster.demoApi;

import org.json.JSONObject;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication

public class DemoApiApplication {


	public static void main(String[] args) throws IOException, InterruptedException{
		String url="https://api.nationalize.io/?name=nathaniel";
		HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		HttpClient client=HttpClient.newBuilder().build();

		HttpResponse<String> httpResponse=client.send(request,HttpResponse.BodyHandlers.ofString());

		JSONObject obj=new JSONObject(httpResponse.body());
		System.out.println(httpResponse.statusCode());
		System.out.println(obj);
	}
}
