package org.example

fun main() {
    println(primeNumbers(5).joinToString())
}

fun primeNumbers(n: Int): List<Int> {
    val primeNumbers = mutableListOf<Int>()
    var potentialPrime = 2
    while (primeNumbers.size < n) {
        if (isPrime(potentialPrime)) {
            primeNumbers.add(potentialPrime)
        }
        potentialPrime++
    }
    return primeNumbers
}

fun isPrime(number: Int): Boolean {
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}