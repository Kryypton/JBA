package com.kryptonn.jba.client;

import com.kryptonn.jba.model.BlizzardWebApiStatusCode;

public class ApiResponse<T> {
    private T data;
    private BlizzardWebApiStatusCode statusCode;

    public ApiResponse() {}

    public ApiResponse(T data) {
        this.data = data;
    }

    public ApiResponse(T data, BlizzardWebApiStatusCode statusCode) {
        this.data = data;
        this.statusCode = statusCode;
    }

    public T getData() {
        return this.data;
    }

    public BlizzardWebApiStatusCode getStatusCode() {
        return this.statusCode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setError(BlizzardWebApiStatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public void setSuccess() {
        this.statusCode = new BlizzardWebApiStatusCode(200, "BLZWEBAPI00000200", "Success");
    }

    public String toString() {
        return this.getData().toString();
    }
}
