package com.practicaljava.lesson16.quoteserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StockQuoteServer {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket client = null;

        BufferedReader inbound = null;
        OutputStream outbound = null;

    try {
        // Create a server soccket

        serverSocket = new ServerSocket(3100);

        System.out.println("Waiting for a quote request...");

        while (true)
        {
            //Wait for a request
            client = serverSocket.accept();

            //Get streams
            inbound = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outbound = client.getOutputStream();

            String symbol = inbound.readLine();

            //Generate a random stock price
            String price = (new Double(Math.random()*100).toString());
            outbound.write(("\n The price of " + symbol + " is " + price + "\n").getBytes());
        }
    }
    catch (IOException e) {
        System.out.println("Error in Server: " + e.getMessage());
    } finally {
        try {
            inbound.close();
            outbound.close();
        } catch (IOException e) {
            System.out.println("Stockserver: cant  close streams " + e.getMessage());
        }
    }

    }

}
