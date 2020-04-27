package br.com.amqp.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import br.com.amqp.config.RabbitConfig;

@Service
public class RabbitMQSender {

  private RabbitTemplate rabbitTemplate;

  public RabbitMQSender(RabbitTemplate rabbitTemplate) {
    this.rabbitTemplate = rabbitTemplate;

  }

  public void sendProduct(Object product) {
    this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_PRODUCTS, product);
  }
}
