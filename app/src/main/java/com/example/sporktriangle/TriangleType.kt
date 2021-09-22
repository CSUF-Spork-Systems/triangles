package com.example.sporktriangle

fun check_triangle(side_a: Int, side_b: Int, side_c: Int): String {
    // Is this a triangle?
    // Is there 1 side that is longer than or equal to the sum of both the other sides?
    if ((side_a >= side_b + side_c) || (side_b >= side_a + side_c) || (side_c >= side_a + side_b))
        return "Not a triangle"

    // Equilateral
    // All 3 sides are the same
    if ((side_a == side_b) && (side_b == side_c))
        return "Equilateral"

    // Isosceles
    // Exactly 2 sides match
    if ((side_a == side_b) || (side_b == side_c) || (side_c == side_a))
        return "Isosceles"

    // Scalene
    // Everything else
    return "Scalene"
}