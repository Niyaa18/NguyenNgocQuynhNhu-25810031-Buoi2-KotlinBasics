// Ho ten: Nguyen Ngoc Quynh Nhu - MSSV: 25810031
package buoi03.bai03

object PhienBanTuongMinh {
    fun ghiNhatKy(hanhDong: String): Unit {
        println("[NHẬT KÝ] $hanhDong")
    }
}

object PhienBanMacDinh {
    fun ghiNhatKy(hanhDong: String) {
        println("[NHẬT KÝ] $hanhDong")
    }
}

// Hai cach tuong duong vi ham co than khoi khi bo kieu tra ve se mac dinh la Unit.
fun main() {
    val hanhDong = "Người dùng đăng nhập hệ thống"

    PhienBanTuongMinh.ghiNhatKy(hanhDong)
    PhienBanMacDinh.ghiNhatKy(hanhDong)
}
