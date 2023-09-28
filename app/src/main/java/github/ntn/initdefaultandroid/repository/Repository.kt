package github.ntn.initdefaultandroid.repository

import github.ntn.initdefaultandroid.data.remote.ApiService

class Repository(private val apiService: ApiService) {
    suspend fun get() = apiService.get()
}