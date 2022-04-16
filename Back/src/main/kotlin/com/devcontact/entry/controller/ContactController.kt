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

    @Get("/{email}")
    fun getOneContact(@PathVariable email: String): MutableHttpResponse<ContactDto>? {
        val result = contactServicePort.getOneContact(email)
        return HttpResponse.ok(result).status(200)
    }

    @Post
    fun postContact(@Body contactDto: ContactDto): MutableHttpResponse<ContactDto>? {
        val result = contactServicePort.postContact(ContactConverter.contactDtoToContact(contactDto))
        //TODO: Pedir para o wesley ajustar o fronte pra receber o codigo de status correto para o created
        return HttpResponse.created(result).status(200)
    }

    @Put("/{email}")
    fun putContact(@Body contactDto: ContactDto): MutableHttpResponse<ContactDto>? {
        val result = contactServicePort.putContact(ContactConverter.contactDtoToContact(contactDto))
        return HttpResponse.ok(result).status(200)
    }

    @Delete("/{email}")
    fun delContact(@PathVariable email: String): MutableHttpResponse<String>? {
        val result = contactServicePort.delContact(email)
        return HttpResponse.ok(result).status(200)
    }
}