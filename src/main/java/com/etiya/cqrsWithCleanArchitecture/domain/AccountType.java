package com.etiya.cqrsWithCleanArchitecture.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="accountTypes")
public class AccountType {
    @Id
    @Column(name="id")
    private String accountTypeId;
    @Column(name="accountName")
    private String accountName;
    @Column(name="decription")
    private String decription;
    @Column(name="price")
    private double price;
}
