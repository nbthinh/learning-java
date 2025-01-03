package com.thinkconstructive.rest_demo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(
            String message, HttpStatus httpStatus, Object responseObject
    ) {
        HashMap<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("status", httpStatus.value());
        response.put("data", responseObject);
        return new ResponseEntity<>(response, httpStatus);
    }
 }
