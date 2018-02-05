package br.com.heiderlopes.notaskotlin.service

import br.com.heiderlopes.notaskotlin.model.Nota
import br.com.heiderlopes.notaskotlin.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class NotaService {

    @Autowired
    lateinit var notaRepository: NotaRepository

    fun salvar(nota: Nota) {
        val aux = notaRepository.findByTitulo(nota.titulo!!)
        if (aux != null) {
            nota.id = aux.id
        }
        notaRepository.save(nota)
    }

    fun buscarTodas(): List<Nota> {
        val notas = notaRepository!!.findAll()
        return notaRepository.findAll()
    }

    fun buscar(titulo: String): Nota {
        return notaRepository.findByTitulo(titulo)
    }
}