object ListStudy {
  def main(args: Array[String]) = {
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(""+ oneTwo +" and "+ threeFour +" were not mutated.")
    println("Thus, "+ oneTwoThreeFour +" is a new list.")
    
    val twoThree = List(2,3)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)
    
    val oneTwoThree2 = 1 :: 2 :: 3 :: Nil
    println(oneTwoThree2)
    
    val pair = (99, "Luftballons")
    println(pair._1)
    println(pair._2)
    
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))
    println(jetSet)
  }
}
