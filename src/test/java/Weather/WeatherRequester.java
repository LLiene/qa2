package Weather;

import Weather.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class WeatherRequester {

    private final String PREFIX = "https://samples.openweathermap.org/data/2.5/weather?q=";
    private final String POSTFIX = "&appid=b6907d289e10d714a6e88b30761fae22";

    //Loģiku ieliek funkcijā, response ir no modeļa Response
    public Response requestWeather(String city, String country) throws IOException {
        //1. solis URL
        String url = PREFIX + city + "," + country + POSTFIX;

        //2. solis SEND REQUEST
        //Taisa objekta kopiju, paņēma no bibliotēkas

        RestTemplate restTemplate = new RestTemplate();
        String responseToParse = restTemplate.getForEntity(url, String.class).getBody();  // String, jo to sagaidām. String.class ir pieraksts.
        //Jāsaglabā mainīgajā iegūtais, tāpēc tur sākumā ieliekt String responseToParse ^^


        //3. solis PĀRVEIDO STRINGU PAR MODELI, izmanto jackson bibliotēku
        ObjectMapper mapper = new ObjectMapper(); //taisa kopiju no šī objekta
        return mapper.readValue(responseToParse, Response.class); //readValue lasa datus. Lai nebūtu pasvītrots sarkans, ALT + ENTER un ieliek exwecption
        // ieliek return beigās, ^^, lai funkcija kko atgrieztu






    }


}
