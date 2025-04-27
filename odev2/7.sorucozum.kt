package odev2

//Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız.
//50GB=100も
//Kota aşımından sonra her 1GB ,4tl'dir.

fun kota_hesaplama(gb: Int): Int {
    var fiyat = 100

    // 50GB'den fazla kota varsa
    if (gb > 50) {
        // Kota aşımını hesapla ve her bir GB için 4 TL ekle
        val fazlalik = gb - 50
        fiyat += fazlalik * 4
    }

    return fiyat
}

fun main(){

    var sonuc = kota_hesaplama(60)
    println("Ücretiniz $sonuc tl'dir ")
}