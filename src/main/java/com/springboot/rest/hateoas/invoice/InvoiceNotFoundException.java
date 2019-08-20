package com.springboot.rest.hateoas.invoice;

public class InvoiceNotFoundException extends RuntimeException {

    public InvoiceNotFoundException(String exception) {
        super(exception);
    }
}
