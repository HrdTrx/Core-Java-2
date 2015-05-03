/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListOfPeopleSigned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;





/**
 *
 * @author root
 */

public class ListOfPeopleSigned {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, Exception{
        
        URL url = new URL("https://www.facebook.com");
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

        SSLSocketFactoryEx factory = new SSLSocketFactoryEx();
        connection.setSSLSocketFactory(factory);
        connection.setRequestProperty("charset", "utf-8");
        
        
        
        InputStream input = connection.getInputStream();
        InputStreamReader reader = new InputStreamReader(input, "utf-8");
        BufferedReader br = new BufferedReader(reader);
 
		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}
        
                

     
        
        
        
        
        
    }
}
