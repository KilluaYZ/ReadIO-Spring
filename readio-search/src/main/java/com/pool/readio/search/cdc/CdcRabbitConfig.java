package com.pool.readio.search.cdc;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CdcRabbitConfig {

    public static final String EXCHANGE = "readio.cdc";
    public static final String QUEUE = "readio.cdc.search";
    public static final String ROUTING_KEY = "readio.cdc.postgres";

    @Bean
    public TopicExchange cdcExchange() {
        return new TopicExchange(EXCHANGE, true, false);
    }

    @Bean
    public Queue cdcQueue() {
        return new Queue(QUEUE, true);
    }

    @Bean
    public Binding cdcBinding(Queue cdcQueue, TopicExchange cdcExchange) {
        return BindingBuilder.bind(cdcQueue).to(cdcExchange).with(ROUTING_KEY);
    }
}

