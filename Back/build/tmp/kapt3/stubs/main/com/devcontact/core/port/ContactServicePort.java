package com.devcontact.core.port;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/devcontact/core/port/ContactServicePort;", "", "delContact", "", "email", "getAllContacts", "", "Lcom/devcontact/entry/dto/ContactDto;", "getOneContact", "postContact", "contact", "Lcom/devcontact/core/model/Contact;", "putContact", "devcontact"})
public abstract interface ContactServicePort {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.devcontact.entry.dto.ContactDto> getAllContacts();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.devcontact.entry.dto.ContactDto getOneContact(@org.jetbrains.annotations.NotNull
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.devcontact.entry.dto.ContactDto postContact(@org.jetbrains.annotations.NotNull
    com.devcontact.core.model.Contact contact);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.devcontact.entry.dto.ContactDto putContact(@org.jetbrains.annotations.NotNull
    com.devcontact.core.model.Contact contact);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String delContact(@org.jetbrains.annotations.NotNull
    java.lang.String email);
}