package com.kryptonn.jba.client;

import com.kryptonn.jba.model.BlizzardWebApiError;

public class ApiResponse<T> {
    private T data;
    private BlizzardWebApiError error;

    public ApiResponse() {
    }

    public ApiResponse(T data) {
        this.data = data;
    }

    public ApiResponse(T data, BlizzardWebApiError error) {
        this.data = data;
        this.error = error;
    }

    public T getData() {
        return this.data;
    }

    public BlizzardWebApiError getError() {
        return this.error;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setError(BlizzardWebApiError error) {
        this.error = error;
    }

    public void setSuccess() {
        this.error = new BlizzardWebApiError(200, "BLZWEBAPI00000200", "Success");
    }

    public String toString() {
        return this.getData().toString();
    }
}
