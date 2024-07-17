data class Driver(val name: String, val team: String, val country: String, var number: Int) {
    fun displayDriverInfo() {
        println("Driver name: $name")
        println("Team: $team")
        println("Country: $country")
        println("Number: $number")
        println()
    }
}