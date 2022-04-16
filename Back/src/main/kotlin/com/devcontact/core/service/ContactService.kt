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
    override fun getAllContacts(): List<ContactDto?> {
        var repository = contactRepositoryPort.getAllContactsRepository()
        return ContactConverter.contactListToContactDtoList(repository)
    }

    override fun getOneContact(email: String): ContactDto {
        val repository = contactRepositoryPort.getOneContactRepository(email)
        return ContactConverter.contactToContactDto(repository!!)
    }

    override fun postContact(contact: Contact): ContactDto {
        var repository = contactRepositoryPort.postContactRepository(ContactConverter.contactToContactEntity(contact))
        return ContactConverter.contactToContactDto(repository)
    }

    override fun putContact(contact: Contact): ContactDto {
        val repository = contactRepositoryPort.putContactRepository(ContactConverter.contactToContactEntity(contact))
        return ContactConverter.contactToContactDto(repository)
    }

    override fun delContact(email: String): String {
        return contactRepositoryPort.delContactRepository(email)
    }
}