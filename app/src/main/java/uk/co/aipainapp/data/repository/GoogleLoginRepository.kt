package uk.co.aipainapp.data.repository

import uk.co.aipainapp.domain.model.LoginResponse

interface GoogleLoginRepository {
    suspend fun googlelogin(socialId: String, email: String, fullName: String, authMethod: String): LoginResponse

}