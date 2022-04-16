package com.devcontact.commons.handler

import com.devcontact.commons.handler.FieldError

class ValidateErrorDto (
    val message: String,
    val timestamp: Long,
    val errors: ArrayList<FieldError>
    )