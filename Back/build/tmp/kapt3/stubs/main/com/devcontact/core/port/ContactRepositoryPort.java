package com.devcontact.core.port;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/devcontact/core/port/ContactRepositoryPort;", "", "delContactRepository", "", "email", "getAllContactsRepository", "", "Lcom/devcontact/core/model/Contact;", "getOneContactRepository", "postContactRepository", "contactEntity", "Lcom/devcontact/infra/entity/ContactEntity;", "putContactRepository", "devcontact"})
public abstract interface ContactRepositoryPort {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.devcontact.core.model.Contact> getAllContactsRepository();
    
    @org.jetbrains.annotations.Nullable
    public abstract com.devcontact.core.model.Contact getOneContactRepository(@org.jetbrains.annotations.NotNull
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.devcontact.core.model.Contact postContactRepository(@org.jetbrains.annotations.NotNull
    com.devcontact.infra.entity.ContactEntity contactEntity);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.devcontact.core.model.Contact putContactRepository(@org.jetbrains.annotations.NotNull
    com.devcontact.infra.entity.ContactEntity contactEntity);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String delContactRepository(@org.jetbrains.annotations.NotNull
    java.lang.String email);
}