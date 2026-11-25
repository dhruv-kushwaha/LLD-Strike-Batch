package com.example.payments;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PaymentApiTest {

    @LocalServerPort
    int port;

    private HttpResponse<String> post(String json) throws Exception {
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://localhost:" + port + "/payments"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        try (HttpClient client = HttpClient.newHttpClient()) {
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        }
    }

    @Test
    void routesToTheRequestedGateway() throws Exception {
        for (String[] c : new String[][]{{"razorpay", "Razorpay"}, {"stripe", "Stripe"}}) {
            HttpResponse<String> response =
                    post("{\"provider\":\"" + c[0] + "\",\"amountInPaise\":500}");

            assertEquals(200, response.statusCode());
            assertTrue(response.body().contains(c[1] + " charged 500 paise"));
        }
    }

    @Test
    void rejectsUnknownProvider() throws Exception {
        assertEquals(400, post("{\"provider\":\"paypal\",\"amountInPaise\":500}").statusCode());
    }

    @Test
    void rejectsMissingProvider() throws Exception {
        assertEquals(400, post("{\"amountInPaise\":500}").statusCode());
    }

    @Test
    void rejectsNonPositiveAmount() throws Exception {
        assertEquals(400, post("{\"provider\":\"stripe\",\"amountInPaise\":0}").statusCode());
    }
}
