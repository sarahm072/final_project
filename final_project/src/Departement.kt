package final_project

class Departement {
    var name : String =""
    val listOfYear:ArrayList<Int> = ArrayList()
    var chefOfTheDeprt :String=""
    fun CreateDepartement():Departement{
        return this
    }
    fun AddYear(year: Int) {
        listOfYear.add(year)
    }
}
