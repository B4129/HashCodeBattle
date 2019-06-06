package com.example.hashcodebattler.Character

import com.example.hashcodebattler.Status.*
import com.example.hashcodebattler.VO.Name
import java.lang.reflect.Array.set

class Warrior() : ICharacter {

    override val name = Name("ウォリアー")
    override val baseStatus = mutableListOf(
        //合計100(HPは1/2コスト)で振り分ける
        HP(100),
        Attack(10),
        Block(20),
        Contact(5),
        Defence(10),
        Speed(5)
    )


    override fun attack() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun block() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}