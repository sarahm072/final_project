package final_project

fun CreateUniv(): university {
    val univ=university()
    println("Enter your university name:")
    val name= readln().toString()
    univ.name=name
    println("Enter your university address")
    val address= readln().toString()
    univ.address=address
    println("Enter your university email:")
    val email= readln().toString()
    univ.email=email
    println("Enter your university phone number:")
    val phone = readln().toString()
    univ.phoneNumber=phone
    println("Enter your university director information:")
    println("Enter your university director name:")
    val nameDirector= readln().toString()
    println("Enter your university director email:")
    val emailDirector= readln().toString()
    println("Enter your university director phone number:")
    val phoneNumberDerector= readln().toString()
    val director=univ_director(nameDirector,emailDirector,phoneNumberDerector)
    return univ
}

fun CreateFacukty():Faculty{
    val faculty=Faculty()
    println("Enter your faculty name:")
    val name= readln().toString()
    faculty.name=name
    println("Enter your faculty director information:")
    println("Enter your faculty director name:")
    val nameDirector= readln().toString()
    println("Enter your faculty director email:")
    val emailDirector= readln().toString()
    println("Enter your faculty director phone number:")
    val phoneNumberDerector= readln().toString()
    val director=faculy_director(nameDirector,emailDirector,phoneNumberDerector)

    return faculty
}

fun CreateDepertement():Departement{
    val dprt=Departement()
    println("Enter your Departement name:")
    val name= readln().toString()
    dprt.name=name
    println("Enter your chaf Departement ")
    val chef= readln().toString()
    dprt.chefOfTheDeprt=chef
    return dprt
}

fun main() {
    println("Enter your university information:")
    val univ = CreateUniv()
    println("Do you want to add faculty?")
    val addf: Boolean = readln().toString().toBoolean()
    if (addf) {
        CreateFacukty()
    }
    println("Do you want to remove faculty?")
    val remove: Boolean = readln().toString().toBoolean()
    if (remove) {
        println("Enter the name of faculty:")
        val faculty = readln().toString()
        univ.RemoveFaculty(faculty)
    }
    println("Do you want to add departement?")
    val addD: Boolean = readln().toString().toBoolean()
    if (addD) {
        CreateDepertement()
    }

}