package com.example.hashcodebattler.Player

import com.example.hashcodebattler.Character.ICharacter
import com.example.hashcodebattler.Character.Warrior

class Enemy constructor()  {

    companion object {
        var character : ICharacter = Warrior()
        var item : Any? = null

    }
}