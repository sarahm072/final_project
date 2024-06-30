package final_project

class univ_director (var name:String,var email:String ,var phoneNumber:String){
     fun setDirettorToFaculty(faculty: Faculty){
         faculty.directorOfFaculty= this.name
     }
     fun setChefDerpt(departement: Departement){
         departement.chefOfTheDeprt=this.name
     }
}