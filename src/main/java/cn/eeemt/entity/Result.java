package cn.eeemt.entity;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/10/010 <br/>
 * time: 0:07 <br/>
 * description:
 */
public class Result<T> implements Serializable {
    private HttpStatus status = HttpStatus.OK;
    private T data;
    private String message;

    public Result(HttpStatus status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status.value();
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
