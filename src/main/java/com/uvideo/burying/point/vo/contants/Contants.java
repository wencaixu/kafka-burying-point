package com.uvideo.burying.point.vo.contants;

public enum Contants {
    TOPIC_PAGE{
        @Override
        public String action() {
            return "topic_page";
        }
    },
    TOPIC_CLICK{
        @Override
        public String action() {
            return "topic_click";
        }
    },
    GROUP_ID{
        @Override
        public String action(){
            return "test-consumer-group";
        }
    },
    BOOTSTRAP_SERVERS{
        @Override
        public String action(){
            return "192.168.1.108:9092";
        }
    };
    public abstract String action();
}
