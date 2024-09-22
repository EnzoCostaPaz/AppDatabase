package com.example.aula2.ViewModel

import com.example.aula2.roomDB.Pessoa
import com.example.aula2.roomDB.PessoaDatabase

class Repository(private val db: PessoaDatabase) {
    suspend fun upsertPessoa(pessoa: Pessoa){
        db.PDao().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa){
        db.PDao().deletePessoa(pessoa)
    }

    fun getAllPessoa() = db.PDao().getAllPessoa()
}
