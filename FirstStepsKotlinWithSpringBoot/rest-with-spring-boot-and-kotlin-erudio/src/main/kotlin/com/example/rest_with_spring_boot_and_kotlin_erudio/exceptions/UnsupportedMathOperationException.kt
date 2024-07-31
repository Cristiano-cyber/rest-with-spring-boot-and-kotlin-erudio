package com.example.rest_with_spring_boot_and_kotlin_erudio.exceptions

import java.lang.*
import kotlin.RuntimeException

class UnsupportedMathOperationException(exception: String): RuntimeException(exception) {
}