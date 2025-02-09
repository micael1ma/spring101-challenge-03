package com.micael1ma.desafio03.dto;

public class FieldMessage {

    private String fieldName;
    private String fieldMessage;

    public FieldMessage(String fielName, String fielMessage) {
        this.fieldName = fielName;
        this.fieldMessage = fielMessage;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldMessage() {
        return fieldMessage;
    }
}
