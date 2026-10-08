// Ho ten: Nguyen Ngoc Quynh Nhu - MSSV: 25810031
package buoi04.bai02

class NhanVien(
    maNhanVien: String,
    val ten: String,
    var luongThang: Double
) {
    init {
        println("Khởi tạo nhân viên có mã: $maNhanVien")
    }

    // Constructor phu goi constructor chinh bang this.
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV01", "Quỳnh Như", 8000000.0)
    val nv2 = NhanVien("Ngọc Anh")

    // println(nv1.maNhanVien)
    // Dong tren se loi vi maNhanVien khong co val/var nen khong la thuoc tinh.

    println()

    println("NHÂN VIÊN THỨ NHẤT")
    println("Tên: ${nv1.ten}")
    println("Lương tháng: ${nv1.luongThang}")

    println()

    println("NHÂN VIÊN THỨ HAI")
    println("Tên: ${nv2.ten}")
    println("Lương tháng: ${nv2.luongThang}")
}
