#language: pt

@teste1
Funcionalidade: Enviar um novo jogo a loja

    Cenario: Deve realizar a inclusao de novos jogos
        Dado faca post de um novo jogo
        E o atributo "page_indx" possuir o valor "11"
        E o atributo "name" possuir o valor "CyberPunk 2077"
        E o atributo "price" possuir o valor "R$ 200,00"
        E o atributo "game_link" possuir o valor "http://teste"
        E o atributo "game_pht" possuir o valor "http://teste"
        Quando eu enviar no endpoint "/game"
        Entao deve me retornar o status code "201"

    Cenario: Deve realizar a inclusao somente se ele possuir um nome
        Dado faca post de um novo jogo
        E o atributo "page_indx" possuir o valor "11"
        E o atributo "price" possuir o valor "R$ 200,00"
        E o atributo "game_link" possuir o valor "http://teste"
        E o atributo "game_pht" possuir o valor "http://teste"
        Quando eu enviar no endpoint "/game"
        Entao deve me retornar o status code "500"