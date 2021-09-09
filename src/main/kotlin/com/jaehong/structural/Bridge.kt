package com.jaehong.structural

interface DrawingAPI {
    fun drawCircle(x: Double, y: Double, radius: Double)
}

/** "ConcreteImplementor" 1/2  */
class DrawingAPI1 : DrawingAPI {
    override fun drawCircle(x: Double, y: Double, radius: Double) {
        System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius)
    }
}

/** "ConcreteImplementor" 2/2  */
class DrawingAPI2 : DrawingAPI {
    override fun drawCircle(x: Double, y: Double, radius: Double) {
        System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius)
    }
}

/** "Abstraction"  */
interface Shape {
    fun draw() // low-level
    fun resizeByPercentage(pct: Double) // high-level
}

/** "Refined Abstraction"  */
class CircleShape(
    private val x: Double,
    private val y: Double,
    private var radius: Double,
    private val drawingAPI: DrawingAPI
) :
    Shape {
    // low-level i.e. Implementation specific
    override fun draw() {
        drawingAPI.drawCircle(x, y, radius)
    }

    // high-level i.e. Abstraction specific
    override fun resizeByPercentage(pct: Double) {
        radius *= pct
    }
}

/** "Client"  */
fun main() {
    val shapes = arrayOfNulls<Shape>(2)
    shapes[0] = CircleShape(1.0, 2.0, 3.0, DrawingAPI1())
    shapes[1] = CircleShape(5.0, 7.0, 11.0, DrawingAPI2())
    for (shape in shapes) {
        shape!!.resizeByPercentage(2.5)
        shape.draw()
    }
}