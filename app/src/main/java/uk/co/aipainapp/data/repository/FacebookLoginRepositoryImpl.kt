package uk.co.aipainapp.data.repository

import uk.co.aipainapp.data.remote.ApiService
import uk.co.aipainapp.domain.model.LoginResponse
import uk.co.aipainapp.domain.model.SocialLoginRequest

class FacebookLoginRepositoryImpl(private val apiService: ApiService) : FacebookLoginRepository {
    override suspend fun facebooklogin(
        socialId: String,
        email: String,
        fullName: String,
        authMethod: String
    ): LoginResponse {
        val response = SocialLoginRequest(socialId, email, fullName, authMethod)
        return apiService.facebooklogin(response)
    }
}