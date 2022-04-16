package com.devcontact.core.mapper

import com.devcontact.core.model.Contact
import com.devcontact.entry.dto.ContactDto
import com.devcontact.infra.entity.ContactEntity

class ContactConverter {
    companion object {
        fun contactDtoToContact(contactDto: ContactDto) = Contact(
            name = contactDto.name,
            email = contactDto.email,
            phone = contactDto.phone
        )

        fun contactToContactDto(contact: Contact) = ContactDto(
            name = contact.name,
            email = contact.email,
            phone = contact.phone
        )

        fun contactToContactEntity(contact: Contact) = ContactEntity(
            name = contact.name,
            email = contact.email,
            phone = contact.phone
        )

        fun contactEntityToContact(contactEntity: ContactEntity) = Contact(
            name = contactEntity.name,
            email = contactEntity.email,
            phone = contactEntity.phone
        )

        fun contactEntityListToContactList(contactEntity: List<ContactEntity>) : List<Contact> {
            return contactEntity.map { Contact(it.name, it.email, it.phone) }
        }

        fun contactListToContactDtoList(contact: List<Contact>): List<ContactDto> {
            return contact.map { ContactDto(it.name, it.email, it.phone) }
        }
    }
}