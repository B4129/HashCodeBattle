package com.example.hashcodebattler.Character

 class CharacterFactory {
     companion object{
         fun create(jobNumber: Int): ICharacter {
             return when (jobNumber) {
                 1 -> Warrior()
                 else -> Mage()
             }
         }
     }

}