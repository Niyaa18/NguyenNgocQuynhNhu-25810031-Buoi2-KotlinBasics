// Ho ten: Nguyen Ngoc Quynh Nhu - MSSV: 25810031
package buoi03.bai02

fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

// Goi ham truc tiep o cap cao nhat cua file, khong dat trong main.
val dienTichThuNhat = tinhDienTich(5.0, 3.0)
val dienTichThuHai = tinhDienTich(7.5, 4.0)

fun main() {
    println("Hình chữ nhật thứ nhất: dài 5.0, rộng 3.0")
    println("Diện tích: $dienTichThuNhat")

    println("Hình chữ nhật thứ hai: dài 7.5, rộng 4.0")
    println("Diện tích: $dienTichThuHai")
}
