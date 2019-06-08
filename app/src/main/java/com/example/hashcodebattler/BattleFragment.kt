package com.example.hashcodebattler

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hashcodebattler.Battle.Action
import com.example.hashcodebattler.Battle.Calculate
import com.example.hashcodebattler.Player.Enemy
import com.example.hashcodebattler.Player.Player
import java.lang.Thread.sleep

class BattleFragment : Fragment() {
    private val calculate = Calculate()
    private val action = Action()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_battle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        while(true){
            startBattle()
        }
    }

    private fun startBattle() {
        val player = Player.character
        val enemy = Enemy.character
        //~~が現れた！
        //どうする？
        //ボタン表示
        //ボタンセレクト
        //ボタン閉じる
        //攻撃
        //遅い方の攻撃
        sleep(1000)
        val actionOrderPair = calculate.actionOrder(player,enemy)
        action.attack("normal",actionOrderPair)
        //入れ替え処理
        val swapPair = Pair(actionOrderPair.second,actionOrderPair.first)
        action.attack("normal",swapPair)
    }
}
