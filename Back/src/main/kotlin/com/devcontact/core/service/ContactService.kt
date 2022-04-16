package com.devcontact.core.service

import com.devcontact.core.mapper.ContactConverter
import com.devcontact.core.model.Contact
import com.devcontact.core.port.ContactRepositoryPort
import com.devcontact.core.port.ContactServicePort
import com.devcontact.entry.dto.ContactDto
import io.micronaut.context.annotation.Prototype

@Prototype
class ContactService(
    private val contactRepositoryPort: ContactRepositoryPort
): ContactServicePort {
    override fun getAllContacts(): List<ContactDto> {
        var repository = contactRepositoryPort.getAllContactsRepository()
        return ContactConverter.contactListToContactDtoList(repository)
    }

    override fun postContact(contact: Contact): ContactDto {
        var repository = contactRepositoryPort.postContactRepository(ContactConverter.contactToContactEntity(contact))
        return ContactConverter.contactToContactDto(repository)
    }
}