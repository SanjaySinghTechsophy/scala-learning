package collections

import scala.collection.mutable.HashSet

object HashSetExample {
  def main(args: Array[String]) {
    val set = HashSet[String]()

    // Add elements to the set
    set.add("Apple")
    set.add("Banana")
    set.add("Orange")

    // Check if an element exists in the set
    println(set.contains("Banana")) // true

    // Remove an element from the set
    set.remove("Apple")

    // Iterate over the elements in the set
    for (element <- set) {
      println(element)
    }
  }
}
