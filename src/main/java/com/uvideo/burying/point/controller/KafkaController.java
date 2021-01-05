package com.uvideo.burying.point.controller;


import com.alibaba.fastjson.JSON;
import com.uvideo.burying.point.vo.ReportClickData;
import com.uvideo.burying.point.vo.ReportData;
import com.uvideo.burying.point.vo.ResponseVo;
import com.uvideo.burying.point.vo.contants.Contants;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping("/web/view")
    public ResponseVo view(@RequestBody ReportData data){
        System.out.println(JSON.toJSONString(data));
        try{
            kafkaTemplate.send(new ProducerRecord<>("topic_view","才哥"));
        }catch (Exception ex){
            throw ex;
        }
        return ResponseVo.success(data);
    }

    @PostMapping("/web/click")
    public ResponseVo click(@RequestBody ReportClickData clickData){
        System.out.println(JSON.toJSONString(clickData));
        try{
            kafkaTemplate.send(new ProducerRecord<>("topic_click","才哥"));
        }catch (Exception ex){
            throw ex;
        }
        return ResponseVo.success(clickData);
    }
}
