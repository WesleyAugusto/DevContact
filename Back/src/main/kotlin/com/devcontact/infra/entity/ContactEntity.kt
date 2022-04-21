package com.devcontact.infra.entity

import com.devcontact.commons.annotations.NoArg
import io.micronaut.core.annotation.Introspected
import org.bson.types.ObjectId

@NoArg
@Introspected
data class ContactEntity(
    var id: ObjectId?,
    var name: String?,
    var email: String?,
    var phone: String?,
    var status: String?
)
