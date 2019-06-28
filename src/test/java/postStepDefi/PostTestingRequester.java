package postStepDefi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

public class PostTestingRequester {
    private final String DOMAIN = "http://qaguru.lv";
    private RestTemplate restTemplate = new RestTemplate();


    //Saglabājam klientu
    public void storeClient(Client client) {
        String url = DOMAIN + "//addNewTestClient";

//Spring bibliotēka, lai strādātu ar atbildēm,

        restTemplate.postForEntity(url, client, String.class); //šis ir POST, tāpēc: jāpadod trīs parametri: endpoint adrese, ko sūta uz šo adresi (klientu),


    }

    //Atgriež sarakstu ar klientiem
    public List<Client> getAllClient() throws IOException { //GET, datu saņemšana
        String url = DOMAIN + "/getAllTestUsers";

//Sūta pieprasījumu ar resttemplate

        String toParse = restTemplate.getForEntity(url, String.class).getBody(); //adrese no kurienes, kādā datu tipā. Pēc tam no tā visa ir jādabū Body


        ObjectMapper objectMapper = new ObjectMapper(); //we need to parse jason to array dont remember what but he found it in stacjoverflow
        TypeFactory typeFactory = objectMapper.getTypeFactory();
        return objectMapper.readValue(toParse, typeFactory.constructCollectionType(List.class, Client.class));


    }
}
