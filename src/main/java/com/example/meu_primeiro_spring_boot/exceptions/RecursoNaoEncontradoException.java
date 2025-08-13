package com.example.meu_primeiro_spring_boot.exceptions;

public class RecursoNaoEncontradoException extends  RuntimeException{
    public RecursoNaoEncontradoException(String message){
        super(message);
    }
}
