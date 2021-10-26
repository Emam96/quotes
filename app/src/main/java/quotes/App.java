
package quotes;

import com.google.gson.Gson;


import java.io.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {


    public static void main(String[] args) throws IOException {


        readFromJson("http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");


    }


    public static void readFromJson( String thePath) throws IOException {


        try {
            URL url = new URL(thePath);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader in = new BufferedReader(inputStreamReader);
//            String line = in.readLine();
//            while(line != null){
//                System.out.println(line);
//                line = in.readLine();
//            }
            Reader reader =in ;
            Gson gson0 = new Gson();
            Api apiQuotes = gson0.fromJson(reader, Api.class);
            System.out.println(apiQuotes.toString());

            Gson gson = new Gson();
            Reader reader2 =new BufferedReader(new FileReader("app/src/main/resources/testjson.json"));
            Quote[] recentQuotes2 = gson.fromJson(reader2, Quote[].class);
            List<Quote> listOfQuotes = new ArrayList<Quote>(Arrays.asList(recentQuotes2));//list of all quotes
            Quote toConvert = new Quote(apiQuotes.getQuoteAuthor(), apiQuotes.getQuoteText());
            listOfQuotes.add(toConvert);

            FileWriter fileWriter = new FileWriter("app/src/main/resources/testjson.json");
            BufferedWriter bw = new BufferedWriter(fileWriter);
            Gson gson2 = new Gson();
            String output = gson2.toJson(listOfQuotes);
            bw.write(output);
            bw.flush();
            bw.close();

        }  catch (IOException e) {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("app/src/main/resources/quotes.json"));
            BufferedReader readJson = new BufferedReader(reader);
            Quote[] result = gson.fromJson(readJson, Quote[].class);
            int max = result.length;
            int min = 1;
            int randomLine = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(result[randomLine].toString());
        }

    }


}




