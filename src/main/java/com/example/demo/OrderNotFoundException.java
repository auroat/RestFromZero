package com.example.demo;

@SuppressWarnings("serial")
class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
	super("Could not find order " + id);
    }
}