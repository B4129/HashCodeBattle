package com.example.hashcodebattler.Character

import com.example.hashcodebattler.Status.IParam

interface ICharacter {

    val baseStatus:MutableList<IParam>
    fun attack()
    fun block()
}