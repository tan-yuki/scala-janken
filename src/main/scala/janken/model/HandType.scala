package janken.model

sealed trait HandType {
  def judge(hand: HandType): JudgementType =
    if (win(hand)) Win
    else if (lose(hand)) Lose
    else Draw

  def win(hand: HandType): Boolean
  def lose(hand: HandType): Boolean
  def draw(hand: HandType): Boolean = hand.equals(this)
}

object Gu extends HandType {
  override def win(hand: HandType): Boolean = hand.equals(Kyoki)
  override def lose(hand: HandType): Boolean = hand.equals(Pa)
}

object Kyoki extends HandType {
  override def win(hand: HandType): Boolean = hand.equals(Pa)
  override def lose(hand: HandType): Boolean = hand.equals(Gu)
}

object Pa extends HandType {
  override def win(hand: HandType): Boolean = hand.equals(Gu)
  override def lose(hand: HandType): Boolean = hand.equals(Kyoki)
}
