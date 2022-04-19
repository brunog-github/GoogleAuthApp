package com.example.googleauthapp.data.repository

import com.example.googleauthapp.domain.repository.DataStoreOperations
import com.example.googleauthapp.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val dataStore: DataStoreOperations
) : Repository {
    override suspend fun saveSignedInState(signedIn: Boolean) {
        dataStore.saveSignedInState(signedIn = signedIn)
    }

    override fun readSignedInState(): Flow<Boolean> {
        return dataStore.readSignedInState()
    }
}