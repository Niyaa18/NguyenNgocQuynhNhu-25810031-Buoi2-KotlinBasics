// Ho ten: Nguyen Ngoc Quynh Nhu - MSSV: 25810031
package buoi03.bai06

// Cap 1: Tinh binh phuong.
fun binhPhuongDayDu(so: Int): Int {
    return so * so
}

fun binhPhuongRutGon(so: Int): Int = so * so

// Cap 2: Tinh chu vi hinh vuong.
fun chuViHinhVuongDayDu(canh: Double): Double {
    return canh * 4
}

fun chuViHinhVuongRutGon(canh: Double): Double = canh * 4

// Cap 3: Kiem tra so chan.
fun laSoChanDayDu(so: Int): Boolean {
    return so % 2 == 0
}

fun laSoChanRutGon(so: Int): Boolean = so % 2 == 0

fun main() {
    println("Bình phương của 5:")
    println("Bản đầy đủ: ${binhPhuongDayDu(5)}")
    println("Bản rút gọn: ${binhPhuongRutGon(5)}")

    println()

    println("Chu vi hình vuông cạnh 3.5:")
    println("Bản đầy đủ: ${chuViHinhVuongDayDu(3.5)}")
    println("Bản rút gọn: ${chuViHinhVuongRutGon(3.5)}")

    println()

    println("Kiểm tra 8 có phải số chẵn:")
    println("Bản đầy đủ: ${laSoChanDayDu(8)}")
    println("Bản rút gọn: ${laSoChanRutGon(8)}")
}
