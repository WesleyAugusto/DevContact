package com.devcontact.infra.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016J,\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\f0\fH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/devcontact/infra/repository/ContactRepository;", "Lcom/devcontact/core/port/ContactRepositoryPort;", "mongoClient", "Lcom/mongodb/client/MongoClient;", "(Lcom/mongodb/client/MongoClient;)V", "delContactRepository", "", "email", "getAllContactsRepository", "", "Lcom/devcontact/core/model/Contact;", "getCollection", "Lcom/mongodb/client/MongoCollection;", "Lcom/devcontact/infra/entity/ContactEntity;", "kotlin.jvm.PlatformType", "getOneContactRepository", "postContactRepository", "contactEntity", "putContactRepository", "devcontact"})
@io.micronaut.context.annotation.Prototype()
public final class ContactRepository implements com.devcontact.core.port.ContactRepositoryPort {
    private final com.mongodb.client.MongoClient mongoClient = null;
    
    public ContactRepository(@org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoClient mongoClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.devcontact.core.model.Contact> getAllContactsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.devcontact.core.model.Contact getOneContactRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.devcontact.core.model.Contact postContactRepository(@org.jetbrains.annotations.NotNull()
    com.devcontact.infra.entity.ContactEntity contactEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.devcontact.core.model.Contact putContactRepository(@org.jetbrains.annotations.NotNull()
    com.devcontact.infra.entity.ContactEntity contactEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String delContactRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    private final com.mongodb.client.MongoCollection<com.devcontact.infra.entity.ContactEntity> getCollection() {
        return null;
    }
}