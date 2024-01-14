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

    private AccountDocument(Builder builder) {
        this.agencyNumber = builder.agencyNumber;
        this.accountNumber = builder.accountNumber;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.status = builder.status;
    }

    @Id
    @Indexed
    private ObjectId _id;
    private int agencyNumber;

    @Indexed
    private int accountNumber;
    private String name;
    private String lastName;
    private AccountStatus status;

    @Indexed
    private String email;

    @Indexed
    private String phone;

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public static class Builder {

        private int agencyNumber;
        private int accountNumber;
        private String name;
        private String lastName;
        private String email;
        private String phone;
        private AccountStatus status;

        public AccountDocument build() {
            return new AccountDocument(this);
        }

        public Builder setAgencyNumber(int agencyNumber) {
            this.agencyNumber = agencyNumber;
            return this;
        }

        public Builder setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setStatus(AccountStatus status) {
            this.status = status;
            return this;
        }
    }
}
