package com.devcontact.core.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/devcontact/core/service/ContactService;", "Lcom/devcontact/core/port/ContactServicePort;", "contactRepositoryPort", "Lcom/devcontact/core/port/ContactRepositoryPort;", "(Lcom/devcontact/core/port/ContactRepositoryPort;)V", "delContact", "", "email", "getAllContacts", "", "Lcom/devcontact/entry/dto/ContactDto;", "getOneContact", "postContact", "contact", "Lcom/devcontact/core/model/Contact;", "putContact", "devcontact"})
@io.micronaut.context.annotation.Prototype()
public final class ContactService implements com.devcontact.core.port.ContactServicePort {
    private final com.devcontact.core.port.ContactRepositoryPort contactRepositoryPort = null;
    
    public ContactService(@org.jetbrains.annotations.NotNull()
    com.devcontact.core.port.ContactRepositoryPort contactRepositoryPort) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.devcontact.entry.dto.ContactDto> getAllContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.devcontact.entry.dto.ContactDto getOneContact(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.devcontact.entry.dto.ContactDto postContact(@org.jetbrains.annotations.NotNull()
    com.devcontact.core.model.Contact contact) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.devcontact.entry.dto.ContactDto putContact(@org.jetbrains.annotations.NotNull()
    com.devcontact.core.model.Contact contact) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String delContact(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
}