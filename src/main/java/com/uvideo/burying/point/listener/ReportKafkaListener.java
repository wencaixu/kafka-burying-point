package com.uvideo.burying.point.listener;


import com.uvideo.burying.point.vo.contants.Contants;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
/**
 * 监听器-消费者
 */
@Slf4j
public class ReportKafkaListener {
    @KafkaListener(id = "kafka-test",topics = {"topic_click","topic_page"})
    public void listener(ConsumerRecord<?,?> record){
        System.out.println("topic" + record.topic());
        System.out.println("partition"+ record.partition()) ;
        System.out.println("offset" + record.offset());
        System.out.println("key" + record.key());
        System.out.println("value" + record.value()) ;
    }
}
