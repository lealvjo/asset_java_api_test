#language: pt

@games
Funcionalidade: Excluindo um jogo
    Contexto:
        Dado faca post de um novo jogo
        E o atributo "page_indx" possuir o valor "11"
        E o atributo "name" possuir o valor "CyberPunk 2077"
        E o atributo "price" possuir o valor "R$ 200,00"
        E o atributo "game_link" possuir o valor "http://teste"
        E o atributo "game_pht" possuir o valor "http://teste"
        Quando eu enviar no endpoint "python/game"
        Entao deve me retornar o status code 201

    Cenario: Deve realizar a exclusao do jogo enviado
        Quando faco um post excluindo o jogo no endpoint "python/game/"
        Entao deve me retornar o status code 200
        E deve retornar um body com a mensagem "game is no longer alive"