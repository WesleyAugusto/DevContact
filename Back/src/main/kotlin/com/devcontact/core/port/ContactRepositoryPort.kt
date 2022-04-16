package com.devcontact.core.port

import com.devcontact.core.model.Contact
import com.devcontact.infra.entity.ContactEntity

interface ContactRepositoryPort {
    fun getAllContactsRepository(): List<Contact>
    fun postContactRepository(contactEntity: ContactEntity): Contact
}