package practice.dto

import javafx.beans.property.SimpleStringProperty

class Customer @JvmOverloads constructor(firstName: String? = "", lastName: String? = "") {
    private val firstName = SimpleStringProperty("")
    private val lastName = SimpleStringProperty("")

    init {
        setFirstName(firstName)
        setLastName(lastName)
    }

    fun getFirstName(): String {
        return firstName.get()
    }

    fun setFirstName(fName: String?) {
        firstName.set(fName)
    }

    fun getLastName(): String {
        return lastName.get()
    }

    fun setLastName(fName: String?) {
        lastName.set(fName)
    }
}