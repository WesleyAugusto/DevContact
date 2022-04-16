package com.devcontact.infra.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J,\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\tH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/devcontact/infra/repository/ContactRepository;", "Lcom/devcontact/core/port/ContactRepositoryPort;", "mongoClient", "Lcom/mongodb/client/MongoClient;", "(Lcom/mongodb/client/MongoClient;)V", "getAllContactsRepository", "", "Lcom/devcontact/core/model/Contact;", "getCollection", "Lcom/mongodb/client/MongoCollection;", "Lcom/devcontact/infra/entity/ContactEntity;", "kotlin.jvm.PlatformType", "postContactRepository", "contactEntity", "devcontact"})
@io.micronaut.context.annotation.Prototype
public final class ContactRepository implements com.devcontact.core.port.ContactRepositoryPort {
    private final com.mongodb.client.MongoClient mongoClient = null;
    
    public ContactRepository(@org.jetbrains.annotations.NotNull
    com.mongodb.client.MongoClient mongoClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.devcontact.core.model.Contact> getAllContactsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.devcontact.core.model.Contact postContactRepository(@org.jetbrains.annotations.NotNull
    com.devcontact.infra.entity.ContactEntity contactEntity) {
        return null;
    }
    
    private final com.mongodb.client.MongoCollection<com.devcontact.infra.entity.ContactEntity> getCollection() {
        return null;
    }
}