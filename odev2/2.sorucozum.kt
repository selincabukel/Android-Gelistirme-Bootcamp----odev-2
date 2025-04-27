package odev2

//2)Kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan bir metod yazınız.

fun dikdortgen_cevresi_hesaplama(a : Int, b : Int) : Int {

    return ((a+b)*2)
}

fun main(){
    println(dikdortgen_cevresi_hesaplama(5,6))
}
