// Esta clase nos hace toda la consulta a la API

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorApi {


    public MonedasApi tasaDeCambio(String origen, String destino, double valor) {
        String apiKey = "bc5baa520c6edb5be3e14088";
        String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/"+ origen + "/"
                + destino + "/" + valor;
        HttpResponse<String> response;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MonedasApi.class);

        } catch (Exception e) {
            throw new RuntimeException("No tengo contizacion existente a USD");
        }


    }
}