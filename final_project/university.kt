package final_project

class University (var name :String, val address :String, val email :String, val phoneNumber :String) {
    val listOfFaculties :ArrayList<Faculty> = ArrayList()
    var directorOfTheUniv :String=""
    fun CreateUniversity(name :String, address :String,email :String,phoneNumber :String):University{
        val  univ = University(name,address,email,phoneNumber)
        return univ
    }

    fun AddFaculty(Faculty:Faculty){
        listOfFaculties.add(Faculty)
    }
    fun RemoveFaculty(Faculty:Faculty){
       listOfFaculties.remove(Faculty)
    }
}
