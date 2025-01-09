package com.example.todo.exception;

import org.springframework.http.HttpStatus;

public class TodoAPIException extends RuntimeException {
    private HttpStatus status;
    private String message;

    public TodoAPIException(HttpStatus status, String message) {
        super(message); // Pass the message to RuntimeException
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
