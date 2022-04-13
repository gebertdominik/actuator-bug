package com.example.actuatorbug;


import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {

  private static final Logger LOGGER = LoggerFactory.getLogger(EventConsumer.class);


  public void consume() throws InterruptedException {
    while(true){
      LOGGER.info("Consuming...");
      TimeUnit.SECONDS.sleep(10);
    }
  }
}
