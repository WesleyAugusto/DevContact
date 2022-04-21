package com.devcontact.infra.repository

import com.devcontact.core.mapper.ContactConverter
import com.devcontact.core.model.Contact
import com.devcontact.core.port.ContactRepositoryPort
import com.devcontact.infra.entity.ContactEntity
import com.mongodb.client.MongoClient
import com.mongodb.client.model.Filters
import io.micronaut.context.annotation.Prototype

@Prototype
class ContactRepository(
    private val mongoClient: MongoClient
): ContactRepositoryPort {
    override fun getAllContactsRepository(): List<Contact?> {
        val result = getCollection().find().toList()
        return ContactConverter.contactEntityListToContactList(result)
    }

    override fun getOneContactRepository(id: String): Contact {
        val contactEntity =  getCollection()
            .find(Filters.eq("_id", id)).toList().firstOrNull()
        println(contactEntity?.id)
        println(contactEntity)

        return ContactConverter.contactEntityToContact(contactEntity!!)
    }

    override fun postContactRepository(contactEntity: ContactEntity): Contact {
        getCollection()
            .insertOne(contactEntity)
        return ContactConverter.contactEntityToContact(contactEntity)
    }

    override fun putContactRepository(contactEntity: ContactEntity): Contact {
        getCollection()
            .replaceOne(
                Filters.eq("_id", contactEntity.id),
                contactEntity
            )
        return ContactConverter.contactEntityToContact(contactEntity)
    }

    override fun delContactRepository(id: String): String {
        var result = getCollection()
            .deleteOne(
                Filters.eq("_id", id)
            ).deletedCount

        return if (result.toInt() == 1) {
            "Disciplina-apagada-com-sucesso!"
        } else {
            "Disciplina-não-Encontrada"
        }

    }

    private fun getCollection() =
        mongoClient
            .getDatabase("dev")
            .getCollection("contact", ContactEntity::class.java)
}