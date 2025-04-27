package odev2

//1)Parametre olarak girilen dereceyi fahrenhiet'a dönüştürdükten sonra geri döndüren bir method yazınız
// F = C x 1.18 + 32

fun dereceTofahrenhiet(c : Double) : Double{

    return (c * 1.18 + 32)
}

fun main(){

    println(dereceTofahrenhiet(45.5))

}