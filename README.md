A Aplicação Chama-se cadastro de beneficiário e foi construída em cima de Java 17 e banco em memória H2.

Para que façamos os testes podemos usar o postman, onde o end point é o http://localhost:8080/api/beneficiarios

Também podemos inserir algm registro por lá. Assim como a api http://localhost:8080/api/documentos.

Caso não possuam o post intalado, podem utilizar o 
Lembrando que o Get é nos beneficíários e o 

GET: curl -X GET http://localhost:8080/api/beneficiarios

POST: curl -X POST -H "Content-Type: application/json" -d '{
    "nome": "Nome do Beneficiário",
    "dataNascimento": "2000-01-01"
}' http://localhost:8080/api/beneficiarios


O mesmo pode ser feito através do cocumentos
