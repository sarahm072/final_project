package final_project

class Year {
    var name:String=""
    val Students:ArrayList<Student> = ArrayList()
    val modules:ArrayList<Modules> = ArrayList()
    val marks:ArrayList<Note> = ArrayList()
    val chefDepartement:String=""
    fun CreateYear(name:String):Year{
        this.name=name
        return this
    }
    fun AddStudent(student:Student){
        Students.add(student)
    }
    fun RemoveStudent(student:Student){
        Students.remove(student)
    }
    fun SendStudNextYear(stud:Student) {

    }
}