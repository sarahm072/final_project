package final_project

class faculy_director(var name:String, var email:String, var phoneNumber:String) {
    fun setChefDerpt(departement: Departement){
        departement.chefOfTheDeprt=this.name
    }
}
