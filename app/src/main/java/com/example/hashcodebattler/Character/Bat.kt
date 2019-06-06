package com.example.hashcodebattler.Character

import com.example.hashcodebattler.Status.*
import com.example.hashcodebattler.VO.Name

class Bat() : ICharacter {

    override val name = Name("こうもり")
    override val baseStatus = mutableListOf(
        //合計80(HPは1/2コスト)で振り分ける
        HP(30),
        Attack(15),
        Block(10),
        Contact(10),
        Defence(10),
        Speed(20)
    )


    override fun attack(target: ICharacter) {

    }

    override fun block() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}