package com.devcontact.entry.controller

import com.devcontact.core.mapper.ContactConverter
import com.devcontact.core.port.ContactServicePort
import com.devcontact.entry.dto.ContactDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/api")
class ContactController(
    private val contactServicePort: ContactServicePort
) {

    @Get
    fun getAllContacts(): MutableHttpResponse<List<ContactDto>>? {
        var result = contactServicePort.getAllContacts()
        return HttpResponse.ok(result).status(200)
    }

    @Post
    fun postContact(@Body contactDto: ContactDto): MutableHttpResponse<ContactDto>? {
        var result = contactServicePort.postContact(ContactConverter.contactDtoToContact(contactDto))
        //TODO: Pedir para o wesley ajustar o fronte pra receber o codigo de status correto para o created
        return HttpResponse.created(result).status(200)
    }
}