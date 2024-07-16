package uk.co.aipainapp.data.repository

import uk.co.aipainapp.data.remote.ApiService
import uk.co.aipainapp.domain.model.LoginRequest
import uk.co.aipainapp.domain.model.LoginResponse

class LoginRepositoryImpl(private val apiService: ApiService) : LoginRepository {
    override suspend fun login(email: String, password: String, authMethod: String): LoginResponse {
        val loginRequest = LoginRequest(email, password, authMethod)
        return apiService.login(loginRequest)
    }
}