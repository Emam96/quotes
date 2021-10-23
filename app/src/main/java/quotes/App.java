
package quotes;

import com.google.gson.Gson;


import java.io.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;


public class App {


    public static void main(String[] args) throws IOException {


        readFromJson("app/src/main/resources/quotes.json");


    }


    public static void readFromJson( String thePath) throws IOException {

        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get(thePath));
        BufferedReader readJson = new BufferedReader(reader);

        Quote[] result = gson.fromJson(readJson, Quote[].class);
        int max = result.length;
        int min = 1;
        int randomLine = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(result[randomLine].toString());

    }


}




