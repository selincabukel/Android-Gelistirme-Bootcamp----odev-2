package odev2

//3)Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız.

fun faktoriyel_hesaplama(f : Int) : Int {

    var sonuc = 1

    for(i in 1..f){
        sonuc *= i
    }
  return sonuc
}


fun main(){
    var sonuc = faktoriyel_hesaplama(5)
    println(sonuc)
}