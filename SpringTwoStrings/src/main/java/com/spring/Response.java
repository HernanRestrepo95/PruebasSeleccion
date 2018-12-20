package com.spring;

public class Response {
    
    public String message;

    public Response(String message) {
        this.message = message;
    }

    public Response() {
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
