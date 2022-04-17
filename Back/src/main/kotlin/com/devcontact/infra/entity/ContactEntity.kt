package com.devcontact.infra.entity

import com.devcontact.commons.annotations.NoArg
import io.micronaut.core.annotation.Introspected

@NoArg
@Introspected
data class ContactEntity(
    var name: String?,
    var email: String?,
    var phone: String?,
    var status: String?
)
