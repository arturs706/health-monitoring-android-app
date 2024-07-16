package uk.co.aipainapp.data.repository

import uk.co.aipainapp.domain.model.LoginResponse

interface FacebookLoginRepository {
    suspend fun facebooklogin(socialId: String, email: String, fullName: String, authMethod: String): LoginResponse

}