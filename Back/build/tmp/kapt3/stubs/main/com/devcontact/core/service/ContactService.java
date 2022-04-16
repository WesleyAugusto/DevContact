package com.devcontact.core.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/devcontact/core/service/ContactService;", "Lcom/devcontact/core/port/ContactServicePort;", "contactRepositoryPort", "Lcom/devcontact/core/port/ContactRepositoryPort;", "(Lcom/devcontact/core/port/ContactRepositoryPort;)V", "getAllContacts", "", "Lcom/devcontact/entry/dto/ContactDto;", "postContact", "contact", "Lcom/devcontact/core/model/Contact;", "devcontact"})
@io.micronaut.context.annotation.Prototype
public final class ContactService implements com.devcontact.core.port.ContactServicePort {
    private final com.devcontact.core.port.ContactRepositoryPort contactRepositoryPort = null;
    
    public ContactService(@org.jetbrains.annotations.NotNull
    com.devcontact.core.port.ContactRepositoryPort contactRepositoryPort) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.devcontact.entry.dto.ContactDto> getAllContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.devcontact.entry.dto.ContactDto postContact(@org.jetbrains.annotations.NotNull
    com.devcontact.core.model.Contact contact) {
        return null;
    }
}