package res;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class WeaUtils {
    private static final String API_KEY = "a1b51d9da77b71f793fa1994c213a336";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&appid=%s";
    static double l1;
	static double l2;
	/*static int accidentCountInt;*/
	/*static int accidentCountInt = Integer.parseInt(accident_count);*/
	static int b;
    public static void doSomething(double l1, double l2, int accidentCountInt) {
        System.out.println("The values of l1 and l2 and accident_count are: " + l1 + ", " + l2 + ", "+accidentCountInt);
	    b = accidentCountInt;
        /*double latitude = 13.0373; // Replace with the desired latitude
    double longitude = 80.2123; // Replace with the desired longitude
*/	 }
    public static void main(String[] args) {
    	
    	
        try {
           
			String weatherData = getWeatherData(l1, l2);
            WeatherInfo weatherInfo = parseWeatherData(weatherData);

            if (weatherInfo != null) {
                System.out.println("Weather condition: " + weatherInfo.weatherCondition);
                System.out.println("Temperature: " + weatherInfo.temperature + " °C");
                System.out.println("Humidity: " + weatherInfo.humidity + "%");
                System.out.println("Visibility: " + weatherInfo.visibility + " meters");
                /*System.out.println("Number of Accidents: " + weatherInfo.b);*/

                // Predict the risk based on weather information and number of accidents
                String riskPrediction = predictRisk(weatherInfo);
                System.out.println("Risk Prediction: " + riskPrediction);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getWeatherData(double latitude, double longitude) throws IOException {
        String apiUrl = String.format(API_URL, latitude, longitude, API_KEY);
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            return response.toString();
        } finally {
            conn.disconnect();
        }
    }

    public static WeatherInfo parseWeatherData(String weatherData) {
        try {
        	/*WeaUtils WeaUtils1 = new WeaUtils();*/
            JSONObject jsonData = new JSONObject(weatherData);
            
            // Extract weather condition
            String weatherCondition = jsonData.getJSONArray("weather").getJSONObject(0).getString("main");

            // Extract temperature
            double temperature = jsonData.getJSONObject("main").getDouble("temp") - 273.15; // Convert to Celsius

            // Extract humidity
            int humidity = jsonData.getJSONObject("main").getInt("humidity");

            // Extract visibility
            int visibility = jsonData.getInt("visibility");

            
			// Set the number of accidents (You can replace this with the actual number of accidents at the location)
            int numAccidents = b;
            System.out.println("numAccidents:"+ numAccidents);
            return new WeatherInfo(weatherCondition, temperature, humidity, visibility, numAccidents);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String predictRisk(WeatherInfo weatherInfo) {
        int accidents = b;
        System.out.println("accidents:"+ accidents);
        if (weatherInfo.weatherCondition.equalsIgnoreCase("Rain")) {
            if (weatherInfo.visibility < 1000) {
                return (accidents >= 30) ? "High Risk" : "Medium Risk";
            } else if (weatherInfo.visibility >= 1000 && weatherInfo.visibility <= 5000) {
                return (accidents >= 40) ? "High Risk" : "Medium Risk";
            } 
            else if (weatherInfo.humidity >= 50 && weatherInfo.humidity <= 80) {
                return (accidents >= 10) ? "Medium Risk" : "Low Risk";
            }else {
                return "Low Risk";
            }
        } else if (weatherInfo.weatherCondition.equalsIgnoreCase("Clouds")) {
            if (weatherInfo.humidity > 80) {
                return (accidents >= 10) ? "High Risk" : "Medium Risk";
            } else if (weatherInfo.humidity >= 50 && weatherInfo.humidity <= 80) {
                return (accidents >= 10) ? "Medium Risk" : "Low Risk";
            } else {
                return "Low Risk";
            }
        } 
        else if (weatherInfo.weatherCondition.equalsIgnoreCase("Mist")) {
            if (weatherInfo.visibility < 1000) {
                return (accidents >= 10) ? "High Risk" : "Medium Risk";
            } else if (weatherInfo.humidity >= 50 && weatherInfo.humidity <= 80) {
                return (accidents >= 10) ? "Medium Risk" : "Low Risk";
            } else {
                return "Low Risk";
            }
        } 
        else if (weatherInfo.weatherCondition.equalsIgnoreCase("Haze")) {
            if (weatherInfo.visibility < 1000) {
                return (accidents >= 40) ? "High Risk" : "Medium Risk";
            } else if (weatherInfo.humidity >= 50 && weatherInfo.humidity <= 80) {
                return (accidents >= 10) ? "Medium Risk" : "Low Risk";
            } else {
                return "Low Risk";
            }
        }
        else if (weatherInfo.weatherCondition.equalsIgnoreCase("Thunderstorm")) {
            if (weatherInfo.visibility < 1000) {
                return (accidents >= 40) ? "High Risk" : "Medium Risk";
            } else if (weatherInfo.humidity >= 50 && weatherInfo.humidity <= 80) {
                return (accidents >= 10) ? "Medium Risk" : "Low Risk";
            } else {
                return "Low Risk";
            }
        }
        else {
            // For all other conditions, predict "Low Risk" as a default
            return "Low Risk";
        }
    }

   public static class WeatherInfo {
        String weatherCondition;
        double temperature;
        int humidity;
        int visibility;
        int accidentCountInt;

        public WeatherInfo(String weatherCondition, double temperature, int humidity, int visibility, int numAccidents) {
            this.weatherCondition = weatherCondition;
            this.temperature = temperature;
            this.humidity = humidity;
            this.visibility = visibility;
            this.accidentCountInt = accidentCountInt;
        }
    }

	
}
