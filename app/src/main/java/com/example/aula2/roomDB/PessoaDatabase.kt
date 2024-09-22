package com.example.aula2.roomDB

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Pessoa::class],
    version = 1
)
abstract class PessoaDatabase: RoomDatabase() {
    abstract fun PDao(): PDao
}