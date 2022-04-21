package com.devcontact.entry.controller

import com.devcontact.core.mapper.ContactConverter
import com.devcontact.core.port.ContactServicePort
import com.devcontact.entry.dto.ContactDto
import io.micronaut.context.annotation.Parameter
import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put

@Controller("/api")
class ContactController(
    private val contactServicePort: ContactServicePort
) {

    @Get
    fun getAllContacts(): MutableHttpResponse<List<ContactDto?>>? {
        var result = contactServicePort.getAllContacts()
        return HttpResponse.ok(result).status(200)
    }

    @Get("/{id}")
    fun getOneContact(@PathVariable id: String): MutableHttpResponse<ContactDto>? {
        val result = contactServicePort.getOneContact(id)
        return HttpResponse.ok(result).status(200)
    }

    @Post
    fun postContact(@Body contactDto: ContactDto): MutableHttpResponse<ContactDto>? {
        val result = contactServicePort.postContact(ContactConverter.contactDtoToContact(contactDto))
        return HttpResponse.created(result).status(201)
    }

    @Put("/{id}")
    fun putContact(@Body contactDto: ContactDto, @PathVariable id: String): MutableHttpResponse<ContactDto>? {
        contactDto.id = id
        val result = contactServicePort.putContact(ContactConverter.contactDtoToContact(contactDto))
        return HttpResponse.ok(result).status(200)
    }

    @Delete("/{id}")
    fun delContact(@PathVariable id: String): MutableHttpResponse<String>? {
        val result = contactServicePort.delContact(id)
        return HttpResponse.ok(result).status(200)
    }
}