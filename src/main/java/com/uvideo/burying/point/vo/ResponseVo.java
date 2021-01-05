package com.uvideo.burying.point.vo;

public class ResponseVo {

    private int code;

    private String msg;

    Object data;

    public ResponseVo() {
    }

    public ResponseVo(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseVo success(Object data){
        return new ResponseVo(200,"success",data);
    }

    public static ResponseVo success(){
        return success(null);
    }

    public static ResponseVo error(Object data){
        return new ResponseVo(500,"error",data);
    }

    public static ResponseVo error(){
        return error(null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
