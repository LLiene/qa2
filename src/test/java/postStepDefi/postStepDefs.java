package postStepDefi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class postStepDefs {
    private PostTestingRequester requester = new PostTestingRequester();
    private Client client;
    private List<Client> clients = new ArrayList<Client>();

    @Given("new client:")
    public void create_client(Map<String, String> params) {
        //taisa objektu (uztaisa klasi zem postStepDefs Client, kur taisa objektu ar getteriem un setteriem)
        //Taisa kopiju šeit

        client = new Client();
        client.setName(params.get("name"));
        client.setSurname(params.get("surname"));
        client.setAge(Integer.valueOf(params.get("age"))); //Tāpēc ka Map Stringus, bet age mums ir integer. Jāpārveido tāpēc uz stringu.
        client.setPk(params.get("pk"));
        client.setEmail(params.get("email"));

    }

    @When("client is sent to server")
    public void send_client() {
        //Taisa jaunu klasi ar requesteru - requesteru vienmēr taisa, kad jāsūta dati (uztaisīts tika kā jauna klase zem poststefdefiem
        requester.storeClient(client); //bija jāuztaisa klases līmenī private Client client, lai šī metode redzētu client


    }

    @When("we receive the list of clients")
    public void get_client_list() throws IOException { //shis automātiski ar alt enter, jo bija sarkans pasvītrots
        clients = requester.getAllClient();
        //Klases līmenī iznes tos mainīgos, lai vairākas metodes varētu izmantot šo clients, savādāk nevar izmantot

    }

    @Then("new client appears in this list")
    public void check_client() {
        //izmantos for un foreach ciklus

        boolean isFound = false;
        for (Client client : clients) { //Client ir datu tips, otrais ir mainīgais, trešais ir nosaukums)
            if (client.getPk().contains(this.client.getPk())) ;
            isFound = true;
            break;
        }

        Assertions.assertTrue(isFound, "client not found");
    }

}
 //UUID - ģenerē unikālu rindu ar simboliem, cipariem