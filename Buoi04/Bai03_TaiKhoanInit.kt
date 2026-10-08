// Ho ten: Nguyen Ngoc Quynh Nhu - MSSV: 25810031
package buoi04.bai03

class TaiKhoanNganHang(
    val soTaiKhoan: String,
    soDuBanDau: Double
) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println(
                "Tạo tài khoản $soTaiKhoan thành công, " +
                    "số dư ban đầu: $soDuBanDau"
            )
        }
    }
}

fun main() {
    val taiKhoanHopLe = TaiKhoanNganHang("TK001", 1000000.0)
    val taiKhoanKhongHopLe = TaiKhoanNganHang("TK002", -50000.0)

    println("Số dư TK001: ${taiKhoanHopLe.soDu}")
    println("Số dư TK002: ${taiKhoanKhongHopLe.soDu}")
}
