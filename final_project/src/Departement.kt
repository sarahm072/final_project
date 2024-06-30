package final_project

import java.time.Year

class Departement {
    var name : String =""
    val listOfYear:ArrayList<Year> = ArrayList()
    var chefOfTheDeprt :String=""
    fun CreateDepartement(name:String):Departement{
       this.name=name
        return this
    }
    fun AddYear(year: Year) {
        listOfYear.add(year)
    }
}
