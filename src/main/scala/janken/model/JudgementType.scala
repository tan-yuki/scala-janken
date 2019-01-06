package janken.model

sealed case class JudgementType(message: String)

object Win extends JudgementType("あなたの勝ちです")
object Draw extends JudgementType("引き分けです")
object Lose extends JudgementType("あなたの負けです")
