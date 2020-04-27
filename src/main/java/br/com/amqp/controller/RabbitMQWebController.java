package br.com.amqp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.amqp.model.Product;
import br.com.amqp.service.RabbitMQSender;

@RestController
@RequestMapping("/api")
public class RabbitMQWebController {

  @Autowired
  RabbitMQSender sender;

  @GetMapping("publisher")
  public ResponseEntity<String> publisher() {
    sender.sendProduct(new Product("Pilha", "2,50"));
    return ResponseEntity.ok("Message sent successfully!");
  }

}
