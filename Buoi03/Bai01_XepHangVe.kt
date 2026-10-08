// Ho ten: Nguyen Ngoc Quynh Nhu - MSSV: 25810031
package buoi03.bai01

fun main() {
    val tuoi = 20

    // Quy uoc: duoi 12 tuoi la tre em, tu 60 tuoi la cao tuoi.
    val loaiVe = if (tuoi < 12) {
        "Vé trẻ em"
    } else if (tuoi < 60) {
        "Vé người lớn"
    } else {
        "Vé cao tuổi"
    }

    println("Tuổi khách hàng: $tuoi")
    println("Loại vé: $loaiVe")
}
