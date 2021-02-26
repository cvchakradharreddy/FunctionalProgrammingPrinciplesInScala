package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  val s = Array(1,2,3)
  val t = Traversable(1,2,3)
}
