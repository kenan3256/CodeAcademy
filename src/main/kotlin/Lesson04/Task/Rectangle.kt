package Lesson04.Task

class Rectangle (var eni:Double, var uzunu: Double) : Shape(), TwoDimensional {
    override fun getName(): ShapeType {
      return ShapeType.RECTANGLE
    }

    override fun calculateArea(): Double {
        return eni * uzunu
    }
}