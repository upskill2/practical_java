package com.practicaljava.lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteReader {
    public static void main(String args[]){
        String nextLine;
        URL url = null;
        URLConnection urlConn = null;

        try
        {
            // Assume index.html is a default home page name
            url  = new URL("http://www.google.com" );
            urlConn = url.openConnection();
        } catch( IOException e){
            System.out.println("Can't connect to the provided URL:" +
                    e.toString() );
        }

        try(InputStream in = url.openStream();
            BufferedReader buff  = new BufferedReader(new InputStreamReader(in));){

            // Read and print the content of the Google's home page
            while (true){
                nextLine =buff.readLine();
                if (nextLine !=null){
                    System.out.println(nextLine);
                }
                else{
                    break;
                }
            }
        } catch(IOException  e1){
            System.out.println("Can't read from the Internet: "+
                    e1.toString() );
        }
    }
}
