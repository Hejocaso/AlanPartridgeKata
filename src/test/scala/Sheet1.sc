val list1 = List("word1","word2","word2","word3","word1")
val list2 = List("word1","word4")

println(list1.filterNot(list2.contains(_)))


println(list1.filterNot(list2.toSet))


def matchFound(numberOfExclamations: Int) = {
  var amount = 0
  var response = "Mine's a Pint"
  while(amount < numberOfExclamations) {
    response += "!"
    amount += 1
  }
  println("HHHHHHHHH" + response)
  response
}

matchFound(2)