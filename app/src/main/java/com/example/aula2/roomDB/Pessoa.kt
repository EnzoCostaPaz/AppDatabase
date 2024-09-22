package com.example.aula2.roomDB

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pessoa(

    val Nome:String,
    val telefone: String,
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0
)
