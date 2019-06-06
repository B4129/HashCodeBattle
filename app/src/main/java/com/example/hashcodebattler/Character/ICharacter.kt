package com.example.hashcodebattler.Character

import com.example.hashcodebattler.Status.IParam
import com.example.hashcodebattler.VO.Name

interface ICharacter {

    val baseStatus:MutableList<IParam>
    val name: Name
    fun attack()
    fun block()
}