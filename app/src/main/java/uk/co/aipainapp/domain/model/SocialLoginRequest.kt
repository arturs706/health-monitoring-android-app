package uk.co.aipainapp.domain.model

data class SocialLoginRequest (
    val socialId: String,
    val email: String,
    val fullName: String,
    val authMethod: String
)