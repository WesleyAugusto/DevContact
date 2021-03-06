package com.devcontact.core.port

import com.devcontact.core.model.Contact
import com.devcontact.infra.entity.ContactEntity

interface ContactRepositoryPort {
    fun getAllContactsRepository(): List<Contact?>
    fun getOneContactRepository(id: String): Contact?
    fun postContactRepository(contactEntity: ContactEntity): Contact
    fun putContactRepository(contactEntity: ContactEntity): Contact
    fun delContactRepository(id: String): String
}