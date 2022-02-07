<h1 align="center">SigaBem</h1>

## Descrição do Projeto
<p align="left">O projeto Sigabem, é uma empresa de transporte de cargas, que calcula o preço do frete, apartir das informações básicas(cepOrigem, e cepDestino).

Para desenvolvimento do projeto, foi utilizado o Java 17, SpringBoot 2.6, banco de dados MySQL 8.0, e Swagger 3.0.

Na estrutura do projeto, foram criadas as classes "model", que é a classe onde é declarado todos os atributos necessários para execução.
A "controller", que é a classe que controla os métodos http que serão chamados apartir do seu endpoint, executando-os de acordo com o código feito.
Classe "service" é a camada de negócio, onde está os métodos usados no sistema.
O "repository", é a classe onde possui a camada de persistência, que age como um repositório de banco de dados. 
E por último a "configuration", que é a classe utilizada para fazer as configurações necessárias para documentação da Api utilizando o swagger, junto a está classe, 
outros arquivos .porperties também foram criados, estes, responsáveis pela configuração para deploy do projeto.
</p>

## Utilização da Api
 <p align="left">Para utilizar a api, é necessário apenas entrar no link do projeto, que está online, https://sigabemprojectbs.herokuapp.com/swagger-ui/, e as informações necessárias para cálculo: peso, cepOrigem, cepDestino, e nomeDestinatario, após execução, o usuário receberá as informações de valor do frete(vlFrete), data da consulta(dataConsulta), data prevista para entrega(dataPrevistaEntrega).
 Tanto as informações enviadas, quanto as que retornam, são registradas no banco online do heroku.

Caso o código seja executado local, utilizando o postman, foram criadas tratativas de erros, apontando especificamente se tem algum campo incorreto, ou nulo. </p>
 
 ## Exemplo de Requisição
 { <br>
  
  "cepOrigem": "12345678", <br>
  "cepDestino": "87654321",<br>
  "nomeDestinatario": "CD2TEC",<br>
  "peso": 10 <br>
  
}
 
 ## Exemplo do Retorno
{ <br>

  "id": null, <br>
  "peso": 10, <br>
  "cepOrigem": "12345678", <br>
  "cepDestino": "87654321", <br>
  "nomeDestinatario": "CD2TEC", <br>
  "vlTotalFrete": 15, <br>
  "dataPrevistaEntrega": "2022-02-10", <br>
  "dataConsulta": "2022-02-07" <br>
  
}
