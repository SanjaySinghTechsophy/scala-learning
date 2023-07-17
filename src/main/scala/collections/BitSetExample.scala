package collections

import scala.collection.mutable

object BitSetExample {
  def main(args: Array[String]) {
    // Create a new empty BitSet
    val bitSet = mutable.BitSet()

    // Add elements to the bitSet
    bitSet.add(1)
    bitSet.add(3)
    bitSet.add(5)

    // Check if an integer exists in the bitSet
    println(bitSet.contains(3)) // true

    // Remove an integer from the bitSet
    bitSet.remove(1)

    // Iterate over the integers in the bitSet
    for (element <- bitSet) {
      println(element)
    }
  }
}
