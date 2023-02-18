import PackageDog.Dog
import sun.awt.windows.WEmbeddedFrame

class Hunter_Dog(name: String,breed: String,Color: String,Character: String,var Voise: String) : Dog(name,breed,Color,Character){
    private var weight: Double=10.0;
    public fun Getweight():Double{
        return weight
    }
    public fun Setweight(weight: Double){
        if (weight<0){
            println("Вес не может быть отрицательным")
        }
        else{
            this.weight=weight;
        }
    }
    open fun Voise(){
        println("$name $Voise")
    }
override fun GetInfo(){
    println("\n Имя собаки: $name \n Порода собаки: $breed \n Цвет собаки: $Color \n Характер собаки: $Character \n Вес собаки: $weight килограмм")
}
}