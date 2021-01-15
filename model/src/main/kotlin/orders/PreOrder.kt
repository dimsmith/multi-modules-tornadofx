package orders

data class PreOrder(val scode: String) {
    val lot = 100 * 90
    val share = lot.div(100)
}