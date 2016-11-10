/**
  * Created by helen on 03/11/16.
  */
class AlanPartridgeKata {
  val termsList = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

  def speak(term: String) = {
    if (termsList.contains(term)) {
      "Mine's a Pint!"
    } else {
      "Lynn, I've pierced my foot on a spike!!"
    }
  }
}