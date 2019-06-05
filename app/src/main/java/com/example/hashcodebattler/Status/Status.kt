package com.example.hashcodebattler.Status

import android.util.Log
import com.example.hashcodebattler.hashcode.HashCode
import android.util.Log.d as d1

class Status(
    list: MutableList<IParam> = mutableListOf(HP(100), Attack(10), Block(10), Contact(10), Defence(10), Speed(10))
) {

    val status = list


    fun addHashValue(hashCode: String) {
        var sumHashValue = 0
        val hashCodeClass = HashCode()
        status.forEachIndexed { index, _ ->
            val addStatusValue = hashCodeClass.generateStatus(index + 1, hashCode)
            status[index].value = status[index].value + addStatusValue
            sumHashValue += addStatusValue
        }
        Log.d("hashValue:" , sumHashValue.toString())
    }


}