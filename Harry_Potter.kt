import PackageCinema.Cinema
import sun.security.krb5.internal.Ticket

class Harry_Potter (filmname: String, seans: String, hall:String, var Voise: String) : Cinema(filmname,seans,hall){
    private var spectators: Double=10.0;
    public fun SetSpectators():Double{
        return spectators
    }
    public fun SetSpectators (spectators: Double){
        if (spectators<0){
            println("Количество зритилей не может быть отрицательным")
        }
        else{
            this.spectators=spectators;
        }
    }
    ////////////////////////////////////////////////////////////////////
    private var ticket: Double=10.0;
    public fun SetTicket():Double{
        return ticket
    }
    public fun SetTicket (ticket: Double){
        if (ticket<0){
            println("Количество зритилей не может быть отрицательным")
        }
        else{
            this.ticket=ticket;
        }
    }
    open fun Voise(){
        println("Зрители кричат: $Voise")
    }
    override fun GetInfo(){
        println("Название фильма: $filmname \n Врема сеанса: $seans \n Номер Зала: $hall \n Количество зрителей: $spectators \n Стоимость билета: $ticket₽")
    }
}