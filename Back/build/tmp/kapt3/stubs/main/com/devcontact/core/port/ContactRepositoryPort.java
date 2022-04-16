package com.devcontact.core.port;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/devcontact/core/port/ContactRepositoryPort;", "", "getAllContactsRepository", "", "Lcom/devcontact/core/model/Contact;", "postContactRepository", "contactEntity", "Lcom/devcontact/infra/entity/ContactEntity;", "devcontact"})
public abstract interface ContactRepositoryPort {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.devcontact.core.model.Contact> getAllContactsRepository();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.devcontact.core.model.Contact postContactRepository(@org.jetbrains.annotations.NotNull
    com.devcontact.infra.entity.ContactEntity contactEntity);
}