package PackageCinema
open class Cinema(_filmname: String,_seans: String,_hall: String){
    var filmname: String =_filmname
    var seans: String =_seans
    var hall: String =_hall
    open fun GetInfo(){
        println("Название фильма: $filmname \n Врема сеанса: $seans \n Номер Зала: $hall  ")
    }
}