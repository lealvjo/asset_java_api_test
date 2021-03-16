package services;

import config.Config;
import io.restassured.response.Response;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestSupport extends Config{

    private Response response;

}
