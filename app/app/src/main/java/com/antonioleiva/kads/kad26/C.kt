package com.antonioleiva.kads.kad26

class C(val a: A, val b: B) : A by a, B by b {
    fun function() {
        functionA()
        functionB()
    }
}