package br.com.lanchonete.exception;

public class ProductInvalidException extends RuntimeException {

    public ProductInvalidException(String field, String content) {
        super(String.format("Produto inválido com base no %s: %s", field, content));
    }

}