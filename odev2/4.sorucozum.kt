package odev2

//Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren bir metod yazınız.

fun kac_adet_aharfi(kelime: String): Int {
    var sayac = 0

    for (i in kelime.lowercase()) {
        if (i == 'a') {
            sayac++
        }
    }

    return sayac
}

fun main(){
    var sonuc = kac_adet_aharfi("Beşiktaşlıyız beşiktaşlı anlayamaz kimse bu aşkı")
    println("$sonuc adet a harfi vardır.")
}

