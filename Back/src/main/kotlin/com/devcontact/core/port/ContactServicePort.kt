package com.devcontact.core.port

import com.devcontact.core.model.Contact
import com.devcontact.entry.dto.ContactDto

interface ContactServicePort {
    fun getAllContacts(): List<ContactDto>
    fun postContact(contact: Contact): ContactDto
}