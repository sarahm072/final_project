package final_project

class Faculty {
    var name:String = ""
    val listOfDepartments:ArrayList<String> = ArrayList()
    var directorOfFaculty:String=""
    fun CreateFaculty():Faculty{
          return this
    }
    fun AddDepartment(department:String){
        listOfDepartments.add(department)
    }
    fun RemoveDepartment(department:String){
         listOfDepartments.remove(department)
    }
}