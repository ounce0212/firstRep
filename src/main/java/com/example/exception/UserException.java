package com.example.exception;

import java.util.List;

/**
 * @项目：test
 * @创建者：linmin
 * @创建时间：2018/1/8
 * @公司：汽车易生活
 */
public class UserException<T> {

    private String status;

    private String message;

    private T data;

    private List<T> datas;

    public UserException(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public UserException(String status, String message) {

        this.status = status;
        this.message = message;
    }

    public UserException(String status, String message, List<T> datas) {
        this.status = status;
        this.message = message;
        this.datas = datas;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
