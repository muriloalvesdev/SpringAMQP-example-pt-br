package br.com.amqp.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import br.com.amqp.config.RabbitConfig;

@Component
public class RabbitMQListener {

  @RabbitListener(queues = RabbitConfig.QUEUE_PRODUCTS)
  public void processProduct(Object product) {
    System.out.println("MESSAGE RECEIVED");
    System.out.println(product);
  }

}
