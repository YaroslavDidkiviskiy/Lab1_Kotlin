fun main() {
    // Вираз 1: (a + b - c) * 2 / 3 % 5 при a = 10, b = 20, c = 5
    val a1 = 10
    val b1 = 20
    val c1 = 5
    val result1 = (a1 + b1 - c1) * 2 / 3 % 5
    println("Результат виразу 1: $result1")

    // Вираз 2: (x > y) && (z > x) || (y > z) при x = 30, y = 40, z = 50
    val x = 30
    val y = 40
    val z = 50
    val result2 = (x > y) && (z > x) || (y > z)
    println("Результат виразу 2: $result2")

    // Вираз 3: (a + b > c) && ((a - b) < c) при a = 10, b = 5, c = 20
    val a3 = 10
    val b3 = 5
    val c3 = 20
    val result3 = (a3 + b3 > c3) && ((a3 - b3) < c3)
    println("Результат виразу 3: $result3")

    // Вираз 4: ((a + b - c) * d / 2 + 10 % 3 - (c and d)) при a = 5; b = 3; c = 2; d = 4
    val a4 = 5
    val b4 = 3
    val c4 = 2
    val d4 = 4
    val result4 = ((a4 + b4 - c4) * d4 / 2 + 10 % 3 - (c4 and d4))
    println("Результат виразу 4: $result4")

    // Вираз 5: ((a - b) * c / d + 15 % 4 - (c or d)) при a = 10; b = 2; c = 5; d = 3
    val a5 = 10
    val b5 = 2
    val c5 = 5
    val d5 = 3
    val result5 = ((a5 - b5) * c5 / d5 + 15 % 4 - (c5 or d5))
    println("Результат виразу 5: $result5")
}
