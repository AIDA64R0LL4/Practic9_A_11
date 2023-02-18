package PackageDog
open class Dog(_name: String,_breed: String,_Color: String,_Character: String) {
    var name: String =_name
    var breed: String =_breed
    var Color: String =_Color
    var Character: String =_Character
    open fun GetInfo(){
        println("Имя собаки: $name \n Порода собаки: $breed \n Цвет собаки: $Color \n Характер собаки: $Character")
    }
}

