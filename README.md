# Spring-AMQP
#### Projeto criado com a finalidade de estudos!

## RabbitMQ, Como funciona?
### Possui:
1. Produtor, que nada mais é que uma aplicação que produz uma mensagem. O produtor por sua vez, envia a mensagem para o seu `broker`.
2. O `broker` é composto por um `exchange` que basicamente são os elementos da arquitetura do protocolo AMQP que recebem as mensagens e as encaminham para filas de acordo com os bindings e o tipo declarado da exchange.
3. Cada fila tem seu `consumer` que é responsável por ficar escutando as filas a todo momento. Quando publicamos uma mensagem em uma determinada fila, o `consumer` deve executar a função que está encarregada a ele.

#### Ilustração abaixo:
<br>
<img src="https://github.com/muriloalvesdev/Spring-AMQP/blob/master/src/main/resources/rabbitmq/geral.png"/>
<br>
