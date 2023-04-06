package com.morphtest.morphtest.mongodb

import com.morphtest.morphtest.models.Client
import org.springframework.data.mongodb.repository.MongoRepository

interface ClientRepository : MongoRepository<Client, String>{
    fun findByName(name: String) : Client?
}