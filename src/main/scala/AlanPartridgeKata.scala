/**
  * Created by helen on 03/11/16.
  */
class AlanPartridgeKata {
  val termsList = Set("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

  def speak(list: List[String]) = {

    if(termsList.filterNot(list.toSet).size < termsList.size) { //Match(es) found and removed from termsList
      val numberOfExclamations = termsList.size - termsList.filterNot(list.toSet).size
      matchFound(numberOfExclamations)
    }
    else {
      "Lynn, I've pierced my foot on a spike!!"
    }
  }

  def matchFound(numberOfExclamations: Int) = {
    var amount = 0
    var response = "Mine's a Pint"
    while(amount < numberOfExclamations) {
      response += "!"
      amount += 1
    }
    println("println=" + response)
    response
  }

}