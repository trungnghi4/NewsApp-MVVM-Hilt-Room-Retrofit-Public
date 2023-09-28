package github.ntn.initdefaultandroid.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("")
    suspend fun get(): Response<Any>
}