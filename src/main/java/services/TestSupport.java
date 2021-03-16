package services;

import config.Config;
import io.restassured.response.Response;
import lombok.*;
import static io.restassured.RestAssured.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestSupport extends Config {

    private Config config = new  Config();
    private Response response;

}
