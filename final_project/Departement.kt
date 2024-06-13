package final_project

class Departement(val name : String,var chefOfTheDeprt :String) {
    val listOfYear:ArrayList<Int> = ArrayList()
    fun CreateDepartement():Departement{
        return this
    }
    fun AddYear(year: Int) {
        listOfYear.add(year)
    }
}
