package services;

import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.Game;
import pojo.ReportResponse;

import java.io.IOException;


import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;


public class GameStoreService extends TestSupport {

    private Game gameNew = new Game();
    private Game gamePut = new Game();

    public void setFieldNewGame(String field, String value) {
        switch (field) {
            case "url":
                gameNew.setUrl(value);
                break;
            case "page_indx":
                gameNew.setPage_indx(value);
                break;
            case "name":
                gameNew.setName(value);
                break;
            case "price":
                gameNew.setPrice(value);
                break;
            case "game_link":
                gameNew.setGame_link(value);
                break;
            case "game_pht":
                gameNew.setGame_pht(value);
                break;
            default:
                break;
        }
    }

    public void setFieldPutGame(String field, String value) {
        switch (field) {
            case "url":
                gamePut.setUrl(value);
                break;
            case "page_indx":
                gamePut.setPage_indx(value);
                break;
            case "name":
                gamePut.setName(value);
                break;
            case "price":
                gamePut.setPrice(value);
                break;
            case "game_link":
                gamePut.setGame_link(value);
                break;
            case "game_pht":
                gamePut.setGame_pht(value);
                break;
            default:
                break;
        }
    }


    public Response postGame(String endPoint) throws IOException {
        String bodySended = new Gson().toJson(gameNew);
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
        Game gameAux = new Gson().fromJson(getResponse().jsonPath().prettify(), Game.class);
        setResponse(given().
                when().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                delete(getUrlEnvironment() + endPoint + gameAux.getId()).
                then().extract().response()
        );
        return getResponse();
    }

    public String getMessageField(String field) {
        ReportResponse reportResponse = new Gson().fromJson(getResponse().jsonPath().prettify(), ReportResponse.class);
        switch (field) {
            case "message":
                return reportResponse.getMessage();

            default:
                return "";
        }
    }

    public Response putGamePrice(String endPoint) throws IOException {
        Game gameAux = new Gson().fromJson(getResponse().jsonPath().prettify(), Game.class);
        String bodySended = new Gson().toJson(gamePut);
        setResponse(given().
                when().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(bodySended).
                put(getUrlEnvironment() + endPoint + gameAux.getId()).
                then().extract().response()
        );
        return getResponse();
    }

    public Response getGame(String endPoint) throws IOException {
        Game gameAux = new Gson().fromJson(getResponse().jsonPath().prettify(), Game.class);
        setResponse(given().
                when().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                get(getUrlEnvironment() + endPoint + gameAux.getId()).
                then().extract().response()
        );
        return getResponse();
    }

    public String getTextField(String field) {
        Game gameBody = new Gson().fromJson(getResponse().jsonPath().prettify(), Game.class);
        switch (field) {
            case "url":
                return gameBody.getUrl();
            case "page_indx":
                return gameBody.getPage_indx();
            case "name":
                return gameBody.getName();
            case "price":
                return gameBody.getPrice();
            case "game_link":
                return gameBody.getGame_link();
            case "game_pht":
                return gameBody.getGame_pht();
            default:
                return "";
        }
    }
}
