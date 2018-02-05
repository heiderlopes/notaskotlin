package br.com.heiderlopes.notaskotlin.repository

import br.com.heiderlopes.notaskotlin.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import java.util.stream.Stream

interface NotaRepository : MongoRepository<Nota, String>{
    @Query("{}")
    fun all(): Stream<Nota>

    fun findByTitulo(titulo: String): Nota
}