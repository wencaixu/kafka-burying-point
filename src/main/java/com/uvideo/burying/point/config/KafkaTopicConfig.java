package com.uvideo.burying.point.config;


import com.uvideo.burying.point.vo.contants.Contants;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configurable
@EnableKafka
public class KafkaTopicConfig {

    @Bean
    public KafkaAdmin kafkaAdmin(){
        Map<String , Object> configs =new HashMap<>() ;
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG,"192.168.1.108:9092") ;
        return new KafkaAdmin(configs) ;
    }

    @Bean(name = "topic_page")
    public NewTopic pageTopic(){

        return new NewTopic(Contants.TOPIC_PAGE.action(),2,(short)1);
    }

    @Bean(name = "topic_click")
    public NewTopic clickTopic(){

        return new NewTopic(Contants.TOPIC_CLICK.action(),2,(short)1);
    }
}
