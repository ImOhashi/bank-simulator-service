package com.ohashi.banksimulatorservice.resources.repositories;

import com.ohashi.banksimulatorservice.resources.models.AccountDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRespository extends MongoRepository<AccountDocument, ObjectId> {
}
