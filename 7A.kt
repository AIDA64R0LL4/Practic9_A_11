import PackageDog.Dog as Dog
import PackageCinema.Cinema as Cinema
fun main(){
    println("Напишите 1, если хотите узнать информацию о собак, если хотите узнать информацию о фильмах, то напишите 2")
             var X = readLine()!!.toInt()
        if(X==2) {
        println("Напишите 1, если хотите узнать информацию о 10 Форсаже, если хотите узнать информацию о Гарри Поттере, то напишите 2")
        var Y = readLine()!!.toInt()
        if(Y==1) {
            var FastX = Cinema("Форсаж 10", "14:34", "12А")
            FastX.GetInfo()
        }
        if(Y==2) {
            var Harry_Potter = Harry_Potter("Гарри Потер", "20:34", "12С", "УРА-УРА")
            println("Напишите стоимость  билета:")
            var ticket = readLine()!!.toDouble()
            Harry_Potter.SetTicket(ticket)
            println("Напишите количестов билета:")
            var spectators = readLine()!!.toDouble()
            Harry_Potter.SetSpectators(spectators)
            Harry_Potter.Voise()
            Harry_Potter.GetInfo()
        }
    }
    if(X==1) {
        println("Напишите 1, если хотите узнать информацию о собаке по кличке:Боб, если хотите узнать информацию о собаке по кличке:Том, то напишите 2")
        var Q = readLine()!!.toInt()
        if(Q==1) {
            val Bob = Dog("Боб", "Овчкарка", "Чёрный", "Добрый")
            Bob.GetInfo()
        }
        if(Q==2) {
            val Tom = Hunter_Dog("Том", "Хаски", "Белый", "Добрый", "Гав-Гав")
            println("Напишите вес собаки:")
            var weight1 = readLine()!!.toDouble()
            Tom.Setweight(weight1)
            Tom.Voise()
            Tom.GetInfo()
        }
    }
}