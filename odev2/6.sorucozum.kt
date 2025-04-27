package odev2

//Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız.
//1 günde 8 saat calışılabilir
//Çalışma saat ücreti: 10 tl
//Mesai saat ücreti : 20 tl
//160 saat üzeri mesai sayılır.

class MaasHesaplayici {

    fun maasHesapla(gunSayisi: Int): Int {
        val saatlikUcret = 10
        val mesaiUcreti = 20
        val birGundeCalismaSaati = 8

        val toplamCalismaSaati = gunSayisi * birGundeCalismaSaati
        val maas = if (toplamCalismaSaati <= 160) {
            toplamCalismaSaati * saatlikUcret
        } else {
            val normalSaat = 160
            val mesaiSaat = toplamCalismaSaati - 160
            (normalSaat * saatlikUcret) + (mesaiSaat * mesaiUcreti)
        }

        return maas
    }
}

// Test etmek için
fun main() {
    val maasHesaplayici = MaasHesaplayici()
    val gunSayisi = 22 // 22 gün çalışmış diyelim
    val maas = maasHesaplayici.maasHesapla(gunSayisi)
    println("Toplam maaş: $maas TL")
}

