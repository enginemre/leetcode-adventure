package util

class SolutionNotFoundException : Exception() {
    override fun toString(): String {
        return  "Solution was not found please try again with valid arguments"
    }
}