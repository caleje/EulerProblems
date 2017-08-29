def getFactors(number: Long, factors: Seq[Long] = Seq(), current: Long = 2): Seq[Long] = {
  if(number == 1) {
    factors
  } else if( number % current == 0 ) {
    val newFactors = factors :+ current
    val newNumber = number / current
    getFactors(newNumber, newFactors, current)
  } else {
    getFactors(number, factors, current + 1)
  }
}

getFactors(2)
getFactors(6)
getFactors(12)
getFactors(13195)
getFactors(600851475143L)
