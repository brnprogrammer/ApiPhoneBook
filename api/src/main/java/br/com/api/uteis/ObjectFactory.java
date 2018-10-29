package br.com.api.uteis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectFactory {
	private ObjectFactory() {
		throw new IllegalStateException("ObjectFactory class");
	}
	
	public static HttpHeaders createHeadersResponseEntity() {
		List<HttpMethod> httpMethod = new ArrayList<>(); 
		httpMethod.add(HttpMethod.GET);
		httpMethod.add(HttpMethod.POST);
		httpMethod.add(HttpMethod.DELETE);
		httpMethod.add(HttpMethod.PUT);
		httpMethod.add(HttpMethod.OPTIONS);
		httpMethod.add(HttpMethod.HEAD);
		
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccessControlAllowMethods(httpMethod);
			
		return headers;
	}
	
	public static Gson createInstanceGson(Boolean dataHora) {
		Gson gson = null;
		if (dataHora) {
			gson = new GsonBuilder()					
				    .setDateFormat("dd/MM/yyyy HH:mm:ss") 
				    .create();
		} else {
			gson = new GsonBuilder()					
				    .setDateFormat("dd/MM/yyyy")	
				    .create();
		}
		return gson;
	}
	
}
