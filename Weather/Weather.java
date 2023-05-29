/**
 * Weather
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Weather {

    final static String apiKey = "RF1zpubW1a4MpO4uIcDSmm7mzIciGSG8";
    static String locationKey; 

    static String url; 


    public static void main(String[] args) throws MalformedURLException, IOException {
       
            String actualThing = getWeatherData("316938");
            System.out.println(actualThing);


        
    }

    public static String getWeatherData(String givenLocationKey) throws MalformedURLException, IOException{

        locationKey = givenLocationKey;
        url =  "http://dataservice.accuweather.com/currentconditions/v1/" + locationKey + "?apikey=" + apiKey;
        String result;

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader ( new InputStreamReader(connection.getInputStream()));
        String str;
        StringBuilder weatherResponse = new StringBuilder();

        while((str = reader.readLine()) != null){
            weatherResponse.append(str);
        }

        result = weatherResponse.toString();
        int indexWeather = result.indexOf("WeatherText");
        int indexWeatherEnd = result.indexOf("WeatherIcon");


        String realResult = result.substring(indexWeather + 14, indexWeatherEnd - 3);
        realResult = "Forecast:" + realResult;

        return realResult;

        


    }
}