package final_project



class department_chef(var name:String, var email:String, var phoneNumber:String)  {
    fun calcMarks(students :List<student>, module:List<modules>): ArrayList<Double> {
        var marks:ArrayList<Double>
        for (student in students) {
            var moyenne: Double = 0.0
            var coefs: Int = 0
            for ((module,note) in student.notes) {
                moyenne += note * module.coef
                coefs += module.coef
            }
            if(coefs>0) {
                moyenne = moyenne / coefs
            }else{
                moyenne=0.0
            }
            marks.add(moyenne)
        }
        return marks
    }
}


