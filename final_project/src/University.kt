package final_project

class University {
    var name :String = ""
    var address :String=""
    var email :String=""
    var phoneNumber :String=""
    var listOfFaculties :ArrayList<Faculty> = ArrayList()
    var directorOfTheUniv :String=""
    fun CreateUniversity(name:String,adress:String,email:String,phone:String):University{
        this.name=name
        this.address=adress
        this.email=email
        this.phoneNumber=phone
        return this
    }
    fun AddFaculty(Faculty:Faculty){
        listOfFaculties.add(Faculty)
    }
    fun RemoveFaculty(Faculty: String){
           listOfFaculties.remove<Any>(element = Faculty)
        }
    }