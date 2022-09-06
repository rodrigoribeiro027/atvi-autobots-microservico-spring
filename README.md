# atvi-autobots-microservico-spring


# API - ROTAS

  <h3> Cliente </h3>
  
  <h4>Se Preferir Baixar O aplicativo Insomnia <a href="">Colections File</a><h4>

* GET
```bash
http://localhost:8080/clientes 
```
* GET
```bash
http://localhost:8080/cliente/1 
```
* POST
```bash
http://localhost:8080/cadastro 
```
* PUT
```bash
http://localhost:8080/atualizar 
```
* DELETE
```bash
http://localhost:8080/excluir 
```
<br>

  <h3> Documento </h3>
  
* GET
```bash
http://localhost:8080/documento/1 
```
* GET
```bash
http://localhost:8080/documentos 
```
* PUT
```bash
http://localhost:8080/atualizarDocumento 
```
* DELETE
```bash
http://localhost:8080/deletarDocumentos 
```
<br>

  <h3> Endereço </h3>
  
* GET
```bash
http://localhost:8080/Endereco/enderecoid/1 
```
* GET
```bash
http://localhost:8080/Endereco/enderecos 
```
* PUT
```bash
http://localhost:8080/Endereco/atualizarEndereco 
```
* DELETE
```bash
http://localhost:8080/Endereco/DeletarEnderecos 
```
<br>

  <h3> Telefone </h3>
  
* GET
```bash
http://localhost:8080/Telefone/telefone/1
```
* GET 
```bash
http://localhost:8080/Telefone/telefones
```
* PUT
```bash
http://localhost:8080/Telefone/atualizarTelefone
```
* DELETE
```bash
http://localhost:8080/Telefone/DeletarTelefones
``` 

<br>

<h1> Json Format </h1>

<br>

  <h3> Cliente </h3>
  
* Post 
```bash
  {
	"nome":"rodrigo",
	"nomeSocial":"santos",
	"dataNascimento": "2002-06-15T18:07:54.237+00:00",
	"dataCadastro": "2022-09-04T18:07:54.237+00:00"
 }
```

* PUT 
```bash
{
	"id": 1,
		"nome": "Pedro Alcântara de Bragança e Bourbon",
		"nomeSocial": "Dom Pedro",
		"dataNascimento": "2002-06-16T01:11:25.656+00:00",
		"dataCadastro": "2022-09-06T01:11:25.656+00:00",
}
```
<br>

<h3> Documento </h3>
  
* PUT 
```bash
{
    "id":1,
	"documentos":[
		{
			"tipo": "RG",
			"numero": "15000"
	}
	]
}
```

<br>

<h3> Endereço </h3>
  
  * PUT 
  ```bash
{
	"id":1,
			"estado": "Rio de Janeiro",
			"cidade": "Moca",
			"bairro": "Copacaba",
			"rua": "Avenida Atlântica",
			"numero": "1702",
			"codigoPostal": "2202100133",
			"informacoesAdicionais": "Hotel Copacabana palace"	
}
```

<br>

<h3> Telefone </h3>

  * PUT 
  ```bash
{
		"id":1,
	"telefones":[
		{
			"ddd": "211",
			"numero": "11111981234576"
	}
	]
} 
```

<br>

<h2> :card_file_box: Estruturação Das Pastas.</h2>

```bash
C:.
└───automanager
    ├───.apt_generated
    ├───.apt_generated_tests
    ├───.mvn
    │   └───wrapper
    ├───.settings
    ├───bin
    │   ├───.mvn
    │   │   └───wrapper
    │   ├───.settings
    │   ├───src
    │   │   ├───main
    │   │   │   ├───java
    │   │   │   │   └───com
    │   │   │   │       └───autobots
    │   │   │   │           └───automanager
    │   │   │   │               ├───controles
    │   │   │   │               ├───entidades
    │   │   │   │               ├───modelo
    │   │   │   │               └───repositorios
    │   │   │   └───resources
    │   │   └───test
    │   │       └───java
    │   │           └───com
    │   │               └───autobots
    │   │                   └───automanager
    │   └───target
    │       └───classes
    ├───src
    │   ├───main
    │   │   ├───java
    │   │   │   └───com
    │   │   │       └───autobots
    │   │   │           └───automanager
    │   │   │               ├───controles
    │   │   │               ├───entidades
    │   │   │               ├───modelo
    │   │   │               └───repositorios
    │   │   └───resources
    │   └───test
    │       └───java
    │           └───com
    │               └───autobots
    │                   └───automanager
    └───target
        ├───classes
        │   └───com
        │       └───autobots
        │           └───automanager
        │               ├───controles
        │               ├───entidades
        │               ├───modelo
        │               └───repositorios
        ├───generated-sources
        │   └───annotations
        ├───generated-test-sources
        │   └───test-annotations
        └───test-classes
            └───com
                └───autobots
                    └───automanager
```
<br>
