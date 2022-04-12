package com.etiya.cqrsWithCleanArchitecture.ws.models;

import lombok.Data;

@Data
public class CreateAccountTypeModel {
    private String accountName;
    private String decription;
    private double price;
}
