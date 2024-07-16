package uk.co.aipainapp.domain.model

data class LoginResponse(
    val accessToken: String? = null,
    val refreshToken: String? = null,
    val status: String
)