package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Ай ай ай, такие сделки создавать!")
public class BadApplicationException extends RuntimeException {
}
