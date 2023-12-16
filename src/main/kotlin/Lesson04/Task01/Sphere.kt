package Lesson04.Task01

class Sphere (var yaricapi : Double) : Shape(), TwoDimensional, ThreeDimensional {
    val pi=3.14
    override fun getName(): ShapeType {
        return ShapeType.SHPERE
    }

    override fun calculateVolume(): Double {
        return 1.3*pi*yaricapi*yaricapi*yaricapi
        }



    override fun calculateArea(): Double {
    return yaricapi*yaricapi*pi
    }
}


