package com.example.hashcodebattler.Battle

import com.example.hashcodebattler.Character.ICharacter

class Action {
    val attack = Attack()
    fun attack(commandString: String, orderPair: Pair<ICharacter, ICharacter>) {
        when (commandString) {
            "normal" -> attack.normalAttack(orderPair)
        }
    }

    fun block() {

    }

    fun skill() {

    }

    fun item() {

    }
}