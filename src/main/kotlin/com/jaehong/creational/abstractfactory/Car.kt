package com.jaehong.creational.abstractfactory

data class Car(
    val engine: Engine,
    val wheel: Wheel
)

fun main() {
    val avanteFactory = AvanteFactory()
    val avante = Car(avanteFactory.createEngine(), avanteFactory.createWheel())
    avante.engine.power()
    avante.wheel.size()

    val sonataFactory = SonataFactory()
    val sonata = Car(sonataFactory.createEngine(), sonataFactory.createWheel())
    sonata.engine.power()
    sonata.wheel.size()
}