package org.francisgonzales.testsampleproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform