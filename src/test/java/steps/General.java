package steps;

import cucumber.api.java.pt.Entao;
import io.restassured.response.Response;
import lombok.*;
import org.junit.Assert;

@Builder
@AllArgsConstructor
public class General {

    @Getter
    @Setter
    private static Response responseGeneral;

    @Entao("deve me retornar o status code {int}")
    public void deve_me_retornar_o_status_code(int statusCode) {
        System.out.println(getResponseGeneral().statusCode());
        Assert.assertEquals(statusCode, getResponseGeneral().statusCode());
    }
}
