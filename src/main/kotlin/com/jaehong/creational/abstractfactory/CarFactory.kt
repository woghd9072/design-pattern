package com.jaehong.creational.abstractfactory

interface CarFactory {
    fun createEngine(): Engine
    fun createWheel(): Wheel
}

class AvanteFactory : CarFactory {
    override fun createEngine(): Engine {
        return AvanteEngine()
    }

    override fun createWheel(): Wheel {
        return AvanteWheel()
    }
}

class SonataFactory : CarFactory {
    override fun createEngine(): Engine {
        return SonataEngine()
    }

    override fun createWheel(): Wheel {
        return SonataWheel()
    }
}