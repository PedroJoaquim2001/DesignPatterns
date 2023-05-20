package com.ApiDesignPatterns.DesignPatterns.configs.validation;

public class FormErrorDto {
    private String var;
    private String error;

    public FormErrorDto(String var, String error) {
        this.var = var;
        this.error = error;
    }

    public String getVar() {
        return var;
    }

    public String getError() {
        return error;
    }
}
