package odev2

//5)Parametre olarak girilen kenar sayısına gore iç açılar toplamını hesaplayıp sonucu geri gönderen metod yazınız.
//İç açılar toplamı =(Kenar sayısı - 2) x 180

fun ic_acilar_toplami_hesaplama(kenar_sayisi: Int): Int {
    if (kenar_sayisi < 3) {
        return -1  // Geçersiz kenar sayısı için -1 dönebiliriz
    }
    return (kenar_sayisi - 2) * 180
}


fun main(){

    val sonuc = ic_acilar_toplami_hesaplama(2)

    if (sonuc == -1) {
        println("Geçersiz kenar sayısı!")
    } else {
        println("İç açıların toplamı: $sonuc'dur")
      }

    }

