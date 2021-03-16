package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import org.junit.Assert;
import services.GameStoreService;

import java.io.IOException;

public class GamesStoreStep {

    private GameStoreService gameStore = new GameStoreService();
    private Response response;


    @Dado("faca post de um novo jogo")
    public void faca_post_de_um_novo_jogo() {

    }

    @Dado("o atributo {string} possuir o valor {string}")
    public void o_atributo_possuir_o_valor(String field, String value) {
        gameStore.setFieldNewGame(field, value);
    }

    @Quando("eu enviar no endpoint {string}")
    public void eu_enviar_no_endpoint(String endPoint) throws IOException {
        response = gameStore.postGame(endPoint);
    }

    @Entao("deve me retornar o status code {int}")
    public void deve_me_retornar_o_status_code(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }

    @Quando("faco um post excluindo o jogo no endpoint {string}")
    public void faco_um_post_excluindo_o_jogo_no_endpoint(String endPoint) throws IOException {
        response = gameStore.deleteGame(endPoint);
    }

    @Entao("deve retornar um body com a mensagem {string}")
    public void deve_retornar_um_body_com_a_mensagem(String message) {
        Assert.assertEquals(message, gameStore.getMessageField("message"));
    }

    @Dado("que altere o preco do jogo enviado")
    public void que_altere_o_preco_do_jogo_enviado() {

    }

    @Dado("o atributo {string} possuir um novo valor {string}")
    public void o_atributo_possuir_um_novo_valor(String field, String value) {
        gameStore.setFieldPutGame(field, value);
    }

    @Quando("eu alterar e enviar no endpoint {string}")
    public void eu_alterar_e_enviar_no_endpoint(String endPoint) throws IOException {
        response = gameStore.putGamePrice(endPoint);
    }

    @Dado("faca get do jogo no endpoint {string}")
    public void faca_get_do_jogo_no_endpoint(String endPoint) throws IOException {
        response = gameStore.getGame(endPoint);
    }

    @Entao("o campo {string} deve ser igual ao valor {string}")
    public void o_campo_deve_ser_igual_ao_valor(String field, String value) {
        Assert.assertEquals(value, gameStore.getTextField(field));
    }

}
