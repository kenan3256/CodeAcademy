package Lesson04.Task

class Circle (var yaricapi : Double) : Shape(), TwoDimensional {
    val pi=3.14

    override fun getName(): ShapeType {
        return ShapeType.CIRCLE
    }
    override fun calculateArea(): Double {
        return yaricapi*yaricapi*pi
    }

}


