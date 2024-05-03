package com.example.demo;

/**
 * @author JackJun
 * @date 2024/5/4 01:16
 */
public class TestResp<T> {

    private T data;


    public TestResp(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
