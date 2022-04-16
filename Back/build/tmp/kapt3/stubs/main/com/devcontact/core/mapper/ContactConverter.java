package com.devcontact.core.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/devcontact/core/mapper/ContactConverter;", "", "()V", "Companion", "devcontact"})
public final class ContactConverter {
    @org.jetbrains.annotations.NotNull
    public static final com.devcontact.core.mapper.ContactConverter.Companion Companion = null;
    
    public ContactConverter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004\u00a8\u0006\u0010"}, d2 = {"Lcom/devcontact/core/mapper/ContactConverter$Companion;", "", "()V", "contactDtoToContact", "Lcom/devcontact/core/model/Contact;", "contactDto", "Lcom/devcontact/entry/dto/ContactDto;", "contactEntityListToContactList", "", "contactEntity", "Lcom/devcontact/infra/entity/ContactEntity;", "contactEntityToContact", "contactListToContactDtoList", "contact", "contactToContactDto", "contactToContactEntity", "devcontact"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.devcontact.core.model.Contact contactDtoToContact(@org.jetbrains.annotations.NotNull
        com.devcontact.entry.dto.ContactDto contactDto) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.devcontact.entry.dto.ContactDto contactToContactDto(@org.jetbrains.annotations.NotNull
        com.devcontact.core.model.Contact contact) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.devcontact.infra.entity.ContactEntity contactToContactEntity(@org.jetbrains.annotations.NotNull
        com.devcontact.core.model.Contact contact) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.devcontact.core.model.Contact contactEntityToContact(@org.jetbrains.annotations.NotNull
        com.devcontact.infra.entity.ContactEntity contactEntity) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.devcontact.core.model.Contact> contactEntityListToContactList(@org.jetbrains.annotations.NotNull
        java.util.List<com.devcontact.infra.entity.ContactEntity> contactEntity) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.devcontact.entry.dto.ContactDto> contactListToContactDtoList(@org.jetbrains.annotations.NotNull
        java.util.List<com.devcontact.core.model.Contact> contact) {
            return null;
        }
    }
}