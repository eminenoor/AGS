/**
 * Weather
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Weather {

    public static void main(String[] args) {
        try {
            String apiKey = "RF1zpubW1a4MpO4uIcDSmm7mzIciGSG8";
            String locationKey = "328328";

            String url = "http://dataservice.accuweather.com/currentconditions/v1/" + locationKey + "?apikey=" + apiKey;

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader (new InputStreamReader(conn.getInputStream()));
            String str;
            StringBuilder weatherResponse = new StringBuilder();

            while((str = reader.readLine()) != null){
                weatherResponse.append(str);
            }


            System.out.println(weatherResponse.toString());


        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}