package final_project

class university (var name :String, val address :String, val email :String,val phoneNumber :String) {
    val listOfFaculties :ArrayList<String> = ArrayList()
    var directorOfTheUniv :String=""
    fun CreateUniversity():university{
        return this
    }
    fun AddFaculty(Faculty:String){
        listOfFaculties.add(Faculty)
    }
    fun RemoveFaculty(Faculty:String){
       listOfFaculties.remove(Faculty)
    }
}