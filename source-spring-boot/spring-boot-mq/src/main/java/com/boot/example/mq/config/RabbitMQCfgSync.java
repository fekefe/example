package com.boot.example.mq.config;


import com.boot.example.mq.define.BaseDefSync;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 */
@Configuration
public class RabbitMQCfgSync {
	
	@Bean
	public Queue syncQueue() {
		return new Queue(BaseDefSync.SYNC_ROUTING);
	}
	
	@Bean
	DirectExchange syncExchange() {
		return new DirectExchange(BaseDefSync.SYNC_EXCHANGE);
	}

	@Bean
	public Binding syncBinding() {
		return BindingBuilder.bind(syncQueue()).to(syncExchange()).with(BaseDefSync.SYNC_ROUTING);
	}
	
}
