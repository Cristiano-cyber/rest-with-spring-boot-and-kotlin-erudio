package com.example.rest_with_spring_boot_and_kotlin_erudio.exceptions

import java.util.Date

class ExceptionResponse(
        val timestamp: Date,
        val message: String?,
        val details: String
)
