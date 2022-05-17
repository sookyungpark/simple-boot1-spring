package com.customproject.coffeeshop.api.repository

import com.customproject.coffeeshop.api.config.property.ApplicationProperties
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository


interface UserRepository {
    fun list(useCache: Boolean = true): List<String>
}

@Repository
@Qualifier(value = "MockUserRepository")
class MockUserRepository(private val appProperties: ApplicationProperties) : UserRepository {

    override fun list(useCache: Boolean): List<String> {
        return arrayListOf("user1", "user2")
    }
}
