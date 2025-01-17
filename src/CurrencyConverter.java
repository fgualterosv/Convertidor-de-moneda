import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class CurrencyConverter {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/";

    public static <JSONObject> double convertCurrency(String fromCurrency, String toCurrency, double amount) throws Exception {
        String requestUrl = API_URL + fromCurrency;
        URL url = new URL(requestUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        JSONObject jsonResponse;
        jsonResponse = new JSONObject(response.toString());
        double exchangeRate = jsonResponse.getJSONObject("conversion_rates").getDouble(toCurrency);

        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        try {
            double amount = 100.0; // Cantidad a convertir
            String fromCurrency = "USD"; // Moneda de origen
            String toCurrency = "EUR"; // Moneda de destino

            double convertedAmount = convertCurrency(fromCurrency, toCurrency, amount);
            System.out.println(amount + " " + fromCurrency + " es igual a " + convertedAmount + " " + toCurrency);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

