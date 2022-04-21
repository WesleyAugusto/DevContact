package com.devcontact.core.mapper

import com.devcontact.core.model.Contact
import com.devcontact.entry.dto.ContactDto
import com.devcontact.infra.entity.ContactEntity
import org.bson.types.ObjectId

class ContactConverter {
    companion object {
        fun contactDtoToContact(contactDto: ContactDto) = Contact(
            id = contactDto.id,
            name = contactDto.name,
            email = contactDto.email,
            phone = contactDto.phone,
            status = contactDto.status
        )

        fun contactToContactDto(contact: Contact) = ContactDto(
            id = contact.id,
            name = contact.name,
            email = contact.email,
            phone = contact.phone,
            status = contact.status
        )

        fun contactToContactEntity(contact: Contact) = ContactEntity(
            id = ObjectId(contact.id),
            name = contact.name,
            email = contact.email,
            phone = contact.phone,
            status = contact.status
        )

        fun contactEntityToContact(contactEntity: ContactEntity) = Contact(
            id = contactEntity.id.toString(),
            name = contactEntity.name,
            email = contactEntity.email,
            phone = contactEntity.phone,
            status = contactEntity.status
        )

        fun contactEntityListToContactList(contactEntity: List<ContactEntity>) : List<Contact> {
            return contactEntity.map { Contact(it.id.toString(), it.name, it.email, it.phone, it.status) }
        }

        fun contactListToContactDtoList(contact: List<Contact?>): List<ContactDto> {
            return contact.map { ContactDto(it?.id, it!!.name, it.email, it.phone, it.status) }
        }
    }
}