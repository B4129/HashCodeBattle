package com.example.hashcodebattler.Character

class CharacterFactory {
    companion object {
        fun create(jobNumber: Int): ICharacter {
            return when (jobNumber) {
                1 -> Warrior()
                2 -> Rogue()
                else -> Mage()
            }
        }
    }
}