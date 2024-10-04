package com.ygornacif.workshopmongob.resources.exception;

public class StandardError {

    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {
    }

    public StandardError(Long timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public StandardError timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public StandardError status(Integer status) {
        this.status = status;
        return this;
    }

    public StandardError error(String error) {
        this.error = error;
        return this;
    }

    public StandardError message(String message) {
        this.message = message;
        return this;
    }

    public StandardError path(String path) {
        this.path = path;
        return this;
    }
}
