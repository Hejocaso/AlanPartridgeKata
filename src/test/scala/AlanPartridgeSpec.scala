import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by helen on 03/11/16.
  */
class AlanPartridgeKataSpec extends FlatSpec with Matchers {

  val noRelatedTerm = "Lynn, I've pierced my foot on a spike!!"
  val relatedTermFound = "Mine's a Pint!"
  val speakAlan = new AlanPartridgeKata

  "Calling AlanPartridgeKata" should
    "return 'Lynn, I've pierced my foot on a spike'" in {
    val unrelatedTermslist = List("Apple", "Banana", "Coconut", "Durian", "Eggplant")
    val result = speakAlan.speak(unrelatedTermslist)
    println(result)
    result shouldBe noRelatedTerm
  }

  "Calling AlanPartridgeKata" should
    "return 'Mine's a Pint!!'" in {
    val termsList = List("Partridge", "PearTree")
    val result = speakAlan.speak(termsList)
    println(result)
    result shouldBe "Mine's a Pint!!" //two !'s

    //val termsList = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
//    for (i <- termsList) {
//      println(speakAlan.speak(i))
//      speakAlan.speak(i) shouldBe relatedTermFound
//    }
  }

  "Calling AlanPartridge" should
    "return 'Mine's a pint!!!!!!!!'" in {
    val termsList = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
    val result = speakAlan.speak(termsList)
    println(result)
    result shouldBe "Mine's a Pint!!!!!!!!"
    }
}