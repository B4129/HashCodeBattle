package com.example.hashcodebattler.Battle

import com.example.hashcodebattler.Character.ICharacter
import java.nio.ByteOrder
import kotlin.math.pow
import kotlin.random.Random

class Calculate {

    //べき乗計算
    fun pow(value: Int, n: Int) = value.toDouble().pow(n).toInt()

    fun actionOrder(player: ICharacter, enemy: ICharacter): Pair<ICharacter,ICharacter> {
        val playerSpeed = player.battleStatus[5].value
        val enemySpeed = enemy.battleStatus[5].value
        val fastedPlayerPair = Pair(player,enemy)
        val fastedEnemyPair = Pair(enemy,player)

        if (playerSpeed == enemySpeed) {
            return if (Random.nextBoolean()) fastedPlayerPair else fastedEnemyPair
        }
        val fastedValue = Math.max(playerSpeed, enemySpeed)
        return if (fastedValue == playerSpeed)fastedPlayerPair else fastedEnemyPair
    }
}