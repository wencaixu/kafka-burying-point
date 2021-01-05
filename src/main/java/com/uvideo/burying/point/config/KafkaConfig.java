package com.uvideo.burying.point.config;

import com.uvideo.burying.point.listener.ReportKafkaListener;
import com.uvideo.burying.point.vo.contants.Contants;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.*;

import java.util.HashMap;
import java.util.Map;

@Configurable
@EnableKafka
public class KafkaConfig {

    @Bean
    public ConsumerFactory<String,String> consumerFactory(){
        return new DefaultKafkaConsumerFactory<>(kafkaConsumerConfig());
    }

    @Bean
    public ProducerFactory<String,String> producerFactory(){
        return new DefaultKafkaProducerFactory(kafkaProducerConfig());
    }

    @Bean
    public Map<String,Object> kafkaConsumerConfig(){
        Map<String,Object> props = new HashMap<>();
        props.put("group.id","test-consumer-group");
        props.put("bootstrap.servers", "192.168.1.108:9092");
        props.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        return props;
    }

    @Bean
    public Map<String,Object> kafkaProducerConfig(){
        Map<String,Object> props = new HashMap<>();
        props.put("bootstrap.servers","192.168.1.108:9092");
        props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
        props.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        return props;
    }

    @Bean
    public KafkaTemplate<String,String> kafkaTemplate(){
        return new KafkaTemplate<>(producerFactory(),true);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,String> kafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory factory = new ConcurrentKafkaListenerContainerFactory();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }

    @Bean
    public ReportKafkaListener reportKafkaListener(){
        return new ReportKafkaListener();
    }
}
