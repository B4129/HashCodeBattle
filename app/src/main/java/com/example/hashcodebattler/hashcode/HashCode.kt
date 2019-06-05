package com.example.hashcodebattler.hashcode

import android.util.Log
import java.security.MessageDigest
import kotlin.random.Random

class HashCode {

    private fun cutHashString(type: Int, hashString: String): String {
        val (first, end) = when (type) {
            //HABCDS職業の順
            1 -> Pair(0, 9)
            2 -> Pair(10, 19)
            3 -> Pair(20, 29)
            4 -> Pair(30, 39)
            5 -> Pair(40, 49)
            6 -> Pair(50, 59)
            7 -> Pair(60, 69)
            else -> Pair(70, 79)
        }
        return hashString.substring(first, end)
    }


    fun create(): String {
        return MessageDigest
            .getInstance("SHA-256")
            .digest(Random.nextInt(1, 10000).toString().toByteArray())
            .joinToString { "%02x".format(it) }
    }

    fun generateNumber(string: String): Int {
        val hashString = cutHashString(7, string)
        val statusValueCharList = hashString
            .filter { it.toString() != "," }
            .filter { it.toString() != " " }
            .map { Integer.parseInt(it.toString(), 16).toShort().toInt() }
        return  statusValueCharList.sum() % 3
    }

    fun generateStatus(type: Int, string: String): Int {
        val hashString = cutHashString(type, string)
        return generateStatusValue(hashString)
    }

     private fun generateStatusValue( hashString: String): Int {
        val statusValueCharList = hashString
            .filter { it.toString() != "," }
            .filter { it.toString() != " " }
            .map { Integer.parseInt(it.toString(), 16).toShort().toInt() }

        return statusValueCharList.sum()



    }

}