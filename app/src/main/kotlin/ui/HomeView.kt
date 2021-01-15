package ui

import javafx.beans.property.SimpleStringProperty
import orders.PreOrder
import tornadofx.*

class HomeView : View("Home") {
    private val sCode = SimpleStringProperty(null)
    override val root = vbox {
        label(sCode)
        button("Add Model") {
            action {
                val order = PreOrder("TLKM")
                sCode.value = "${order.scode} - ${order.lot} Lot, ${order.share} Shr"
            }
        }
    }
}
