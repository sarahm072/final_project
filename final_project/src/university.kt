package final_project

class university {
    var name :String = ""
    var address :String=""
    var email :String=""
    var phoneNumber :String=""
    var listOfFaculties :ArrayList<String> = ArrayList()
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