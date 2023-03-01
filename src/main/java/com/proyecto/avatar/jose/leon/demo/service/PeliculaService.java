package com.proyecto.avatar.jose.leon.demo.service;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class PeliculaService {
	
	public static String getServicePeliculas() {
		try {
            URL verifyUrl = new URL("https://swapi.dev/api/films/?format=json");

           HttpsURLConnection conn = (HttpsURLConnection) verifyUrl.openConnection();
           conn.setRequestMethod("GET");
           conn.setRequestProperty("Content-Type", "application/json");
           conn.setDoOutput(true);

           InputStream is = conn.getInputStream();

           // Transformar a cadena array de json que se recibe
           String encoding = "UTF-8";
           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
           byte[] byteSize = new byte[1024];

           int length;
           while ((length = is.read(byteSize)) != -1) {
               byteArrayOutputStream.write(byteSize, 0, length);
           }

           return byteArrayOutputStream.toString(encoding);
       } catch (Exception e) {
           return e.getMessage();
       }
	}
	
	public static String getServiceActores(String id) {
		try {
            URL verifyUrl = new URL("https://swapi.dev/api/people/"+id+"/?format=json");

           HttpsURLConnection conn = (HttpsURLConnection) verifyUrl.openConnection();
           conn.setRequestMethod("GET");
           conn.setRequestProperty("Content-Type", "application/json");
           conn.setDoOutput(true);

           InputStream is = conn.getInputStream();

           // Transformar a cadena array de json que se recibe
           String encoding = "UTF-8";
           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
           byte[] byteSize = new byte[1024];

           int length;
           while ((length = is.read(byteSize)) != -1) {
               byteArrayOutputStream.write(byteSize, 0, length);
           }

           return byteArrayOutputStream.toString(encoding);
       } catch (Exception e) {
           return e.getMessage();
       }
	}
}
