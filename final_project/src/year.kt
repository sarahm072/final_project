package final_project

class year {
    val name:String=""
    val Students:ArrayList<String> = ArrayList()
    val modules:ArrayList<String> = ArrayList()
    val marks:ArrayList<Double> = ArrayList()
    val chefDepartement:String=""
    fun CreateYear():year{
        return this
    }
    fun AddStudent(student:String){
        Students.add(student)
    }
    fun RemoveStudent(student:String){
        Students.remove(student)
    }
    fun SendStudNextYear(stud:student) {

    }
}