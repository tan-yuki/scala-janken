import janken.model._

/**
  * Created by tan-yuki on 2019/01/06.
  */
object Main {

  private val map = Map[String, HandType](
    "gu" -> Gu,
    "kyoki" -> Kyoki,
    "pa" -> Pa
  )

  def main(args: Array[String]): Unit = {
    val myHand = map(args(0))
    val oppositeHand = map(args(1))

    val judgement = myHand.judge(oppositeHand)

    println(judgement.message)
  }
}
