package final_project

import java.time.Year

class Departement(val name : String,var chefOfTheDeprt :String) {
    val listOfYear:ArrayList<year> = ArrayList()
    fun CreateDepartement():Departement{
        var depertement:Departement
        return depertement
    }
    fun AddYear(year: year) {
        listOfYear.add(year)
    }
}
