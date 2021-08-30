import math.{sqrt,pow}

object MyApp extends App {
   val p1 = Point(5,8)
   val p2 = Point(2,3)

   println(s"Point 1 ${p1} ")
   println(s"Point 2 ${p2} ")
   val p3=p1+p2
   val p4=p1.move(4,3)
   val p5=p1.distance(p2)
   val p6=p1.invert()

   println(s"Add Points = ${p3} ")
   println(s"Move Point = ${p4} ")
   println((f"Distance between Points = ${p5} "))
   println((s"Invert Point = ${p6} "))

}

case class Point(a:Int,b:Int)  {
    def x:Int =a
    def y:Int =b

    def +(that:Point)=Point(this.x+that.x,this.y+that.y)
    def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)
    def distance(point2:Point):Double=sqrt(pow(this.x-point2.x,2)+pow(this.y-point2.y,2))
    def invert()=Point(this.y,this.x)
}
