package com.devcontact.entry.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0018\u00010\u0006H\u0007J\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007J\u001a\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0007J\u001a\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/devcontact/entry/controller/ContactController;", "", "contactServicePort", "Lcom/devcontact/core/port/ContactServicePort;", "(Lcom/devcontact/core/port/ContactServicePort;)V", "delContact", "Lio/micronaut/http/MutableHttpResponse;", "", "email", "getAllContacts", "", "Lcom/devcontact/entry/dto/ContactDto;", "getOneContact", "postContact", "contactDto", "putContact", "devcontact"})
@io.micronaut.http.annotation.Controller(value = "/api")
public final class ContactController {
    private final com.devcontact.core.port.ContactServicePort contactServicePort = null;
    
    public ContactController(@org.jetbrains.annotations.NotNull
    com.devcontact.core.port.ContactServicePort contactServicePort) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Get
    public final io.micronaut.http.MutableHttpResponse<java.util.List<com.devcontact.entry.dto.ContactDto>> getAllContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Get(value = "/{email}")
    public final io.micronaut.http.MutableHttpResponse<com.devcontact.entry.dto.ContactDto> getOneContact(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.PathVariable
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Post
    public final io.micronaut.http.MutableHttpResponse<com.devcontact.entry.dto.ContactDto> postContact(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    com.devcontact.entry.dto.ContactDto contactDto) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Put(value = "/{email}")
    public final io.micronaut.http.MutableHttpResponse<com.devcontact.entry.dto.ContactDto> putContact(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    com.devcontact.entry.dto.ContactDto contactDto) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Delete(value = "/{email}")
    public final io.micronaut.http.MutableHttpResponse<java.lang.String> delContact(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.PathVariable
    java.lang.String email) {
        return null;
    }
}