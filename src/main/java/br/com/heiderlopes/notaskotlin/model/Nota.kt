package br.com.heiderlopes.notaskotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Nota {

    @Id
    var id: String? = null
    var titulo: String? = null
    var descricao: String? = null
}