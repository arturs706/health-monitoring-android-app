package uk.co.aipainapp.data.repository

import uk.co.aipainapp.data.remote.ApiService
import uk.co.aipainapp.domain.model.LoginResponse
import uk.co.aipainapp.domain.model.SocialLoginRequest

class GoogleLoginRepositoryImpl(private val apiService: ApiService): GoogleLoginRepository {
    override suspend fun googlelogin(
        socialId: String,
        email: String,
        fullName: String,
        authMethod: String
    ): LoginResponse {
        val loginRequest = SocialLoginRequest(socialId, email, fullName, authMethod)
        return apiService.googlelogin(loginRequest)
    }
}
