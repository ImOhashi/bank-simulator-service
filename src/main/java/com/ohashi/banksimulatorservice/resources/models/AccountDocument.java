package com.ohashi.banksimulatorservice.resources.models;

import com.ohashi.banksimulatorservice.resources.models.enums.AccountStatus;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("account")
public class AccountDocument {

    @PersistenceCreator
    public AccountDocument(ObjectId _id, int agencyNumber, int accountNumber, String name, String lastName, String email, String phone, AccountStatus status) {
        this._id = _id;
        this.agencyNumber = agencyNumber;
        this.accountNumber = accountNumber;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }

    @Id
    @Indexed
    private ObjectId _id;
    private int agencyNumber;
    private int accountNumber;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private AccountStatus status;
}
