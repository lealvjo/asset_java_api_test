package services;

import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.Game;

import java.io.IOException;


import static io.restassured.RestAssured.given;


public class GameStoreService extends TestSupport {
    private Game game = new Game();

    public void setFieldGame(String field, String value) {

        switch (field) {
            case "url":
                game.setUrl(value);
                break;
            case "page_indx":
                game.setPage_indx(value);
                break;
            case "name":
                game.setName(value);
                break;
            case "price":
                game.setPrice(value);
                break;
            case "game_link":
                game.setGame_link(value);
                break;
            case "game_pht":
                game.setGame_pht(value);
                break;
            default:
                break;
        }
    }


    public Response postGame(String endPoint) throws IOException {
        String bodySended = new Gson().toJson(game);
        setResponse(given().
                when().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(bodySended).
                post(getUrlEnvironment() + endPoint).
                then().extract().response()
        );
        return getResponse();
    }

    public Response deleteGame(String endPoint) throws IOException {
        Game obj = new Gson().fromJson(getResponse().jsonPath().prettify(), Game.class);

        setResponse(given().
                when().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                delete(getUrlEnvironment() + endPoint).
                then().extract().response()
        );
        return getResponse();
    }
}
