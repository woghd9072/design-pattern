package com.jaehong.creational.abstractfactory

interface Engine {
    fun power()
}

interface Wheel {
    fun size()
}

class AvanteEngine : Engine {
    override fun power() {
        println("This is Avante Engine !")
    }
}

class AvanteWheel : Wheel {
    override fun size() {
        println("This is Avante Wheel size")
    }
}

class SonataEngine : Engine {
    override fun power() {
        println("This is Sonata Engine !")
    }
}

class SonataWheel : Wheel {
    override fun size() {
        println("This is Sonata Wheel size")
    }
}