package com.pro.taskmanagement.exception;

import com.pro.taskmanagement.services.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExcetionHandler {
    @ExceptionHandler(TaskService.TaskNotFoundException.class)
    public ResponseEntity<String> taskNotFoundException(TaskService.TaskNotFoundException e) {
        return  new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}
