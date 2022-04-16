package com.devcontact.infra.repository

import com.devcontact.core.mapper.ContactConverter
import com.devcontact.core.model.Contact
import com.devcontact.core.port.ContactRepositoryPort
import com.devcontact.infra.entity.ContactEntity
import com.mongodb.client.MongoClient
import io.micronaut.context.annotation.Prototype

@Prototype
class ContactRepository(
    private val mongoClient: MongoClient
): ContactRepositoryPort {
    override fun getAllContactsRepository(): List<Contact> {
        var result = getCollection().find().toList()
        return ContactConverter.contactEntityListToContactList(result)
    }

    override fun postContactRepository(contactEntity: ContactEntity): Contact {
        getCollection()
            .insertOne(contactEntity)
        return ContactConverter.contactEntityToContact(contactEntity)
    }

private fun getCollection() =
    mongoClient
        .getDatabase("dev")
        .getCollection("contact", ContactEntity::class.java)
}