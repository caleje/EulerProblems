//1 to 10 map fib filter {_ % 2 == 0}
//1 to 4000000 map fib filter {_ % 2 == 0} sum

//(1 to 10).map(Seq(_)).foldLeft(Seq(1, 1)) { (numbers, curr) => {
//  val next = numbers.reverse.take(2).sum
//  numbers :+ next
//  }
//}

val allNumbers = (1 to 200).view.foldLeft(Seq[Double](1, 1))((list, _) => list :+ list.reverse.take(2).sum).filter(_ < 4e6).filter(_%2 == 0).sum

