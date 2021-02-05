package services;

import pojo.Game;
import com.google.gson.Gson;

public class GameService {

    public void setField(Game game, String field, String value) {
        switch (field){
            case "url": game.setUrl(value); break;
            case "page_indx": game.setPage_indx(value); break;
            case "name": game.setName(value); break;
            case "price": game.setPrice(value); break;
            case "game_link": game.setGame_link(value); break;
            case "game_pht": game.setGame_pht(value); break;
            default: break;
        }
    }

    public void post(Game game) {
        String bodySended = new Gson().toJson(game);
        setResponse(given().
                when().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(bodySended).
                post(getURI()).
                then().extract().response()
        );

        Game usersAux = getGson().fromJson(getResponse().jsonPath().prettify(), Game.class);
        setLastId(usersAux.getId());
    }
}
