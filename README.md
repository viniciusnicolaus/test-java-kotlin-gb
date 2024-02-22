# Projeto

Boticário Test - GB - TECH

## Informações e Pré requisitos

Aqui estão algumas informações sobre como executar o projeto em sua máquina e sobre a composição do projeto.

O projeto é desenvolvido na linguagem Kotlin e utiliza o gradle.

* JDK 17 (LTS)

### How to 🔨

Um guia passo a passo que lhe dirá como colocar o ambiente de desenvolvimento em funcionamento.

```
$ ./gradlew clean build
```

```
$ ./gradlew :bootRun
```

## Informações sobre servidor

Servidor ficará disponível na rota http://localhost:8080/

## Documentação adicional

Nos recursos, você encontra um json com uma coleção postman para simplificar seus testes utilizando todas as solicitações.

### Backend Test

[![Build Status](https://travis-ci.com/belezanaweb/test-java.svg?branch=master)](https://travis-ci.com/belezanaweb/test-java)

[![codecov](https://codecov.io/gh/belezanaweb/test-java/branch/master/graph/badge.svg)](https://codecov.io/gh/belezanaweb/test-java)

Esta é uma avaliação básica de código.

O objetivo é conhecer um pouco do seu conhecimento/prática de RESTful, Spring e Java.

Recomendamos que você não gaste mais do que 4 - 6 horas.

Faça um fork deste repositório que contém o bootstrap de uma aplicação SpringBoot 1.5.12. (você pode utilizar spring boot 2+)

Ao finalizar o teste, submeta um pull request para o repositório que nosso time será notificado.

### Tarefas

Com a seguinte representação de produto:

```json
{
    "sku": 43264,
    "name": "L'Oréal Professionnel Expert Absolut Repair Cortex Lipidium - Máscara de Reconstrução 500g",
    "inventory": {
        "quantity": 15,
        "warehouses": [
            {
                "locality": "SP",
                "quantity": 12,
                "type": "ECOMMERCE"
            },
            {
                "locality": "MOEMA",
                "quantity": 3,
                "type": "PHYSICAL_STORE"
            }
        ]
    },
    "isMarketable": true
}
```

Crie endpoints para as seguintes ações:

- [X] Criação de produto onde o payload será o json informado acima (exceto as propriedades **isMarketable** e **inventory.quantity**)

- [X] Edição de produto por **sku**

- [X] Recuperação de produto por **sku**

- [X] Deleção de produto por **sku**

### Requisitos


- [X] Toda vez que um produto for recuperado por **sku** deverá ser calculado a propriedade: **inventory.quantity**

        A propriedade inventory.quantity é a soma da quantity dos warehouses

- [X] Toda vez que um produto for recuperado por **sku** deverá ser calculado a propriedade: **isMarketable**

        Um produto é marketable sempre que seu inventory.quantity for maior que 0

- [X] Caso um produto já existente em memória tente ser criado com o mesmo **sku** uma exceção deverá ser lançada

        Dois produtos são considerados iguais se os seus skus forem iguais


- [X] Ao atualizar um produto, o antigo deve ser sobrescrito com o que esta sendo enviado na requisição

        A requisição deve receber o sku e atualizar com o produto que tbm esta vindo na requisição

### Dicas

- Os produtos devem ficar em memória, não é necessário persistir os dados. Não utilize `h2`
- Não é necessário adicionar swagger (não será avaliado)
- Sinta-se a vontade para fazer o código em ```groovy```, ```kotlin``` ou ```scala``` se preferir, utilizamos bastante aqui
- Testes são sempre bem-vindos :smiley:
