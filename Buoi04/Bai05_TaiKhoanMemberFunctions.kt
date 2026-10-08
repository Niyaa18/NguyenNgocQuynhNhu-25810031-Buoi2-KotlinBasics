// Ho ten: Nguyen Ngoc Quynh Nhu - MSSV: 25810031
package buoi04.bai05

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

    fun napTien(soTien: Double) {
        if (soTien <= 0) {
            println("Số tiền nạp phải lớn hơn 0")
            return
        }

        soDu += soTien
        println("Đã nạp: $soTien")
    }

    fun rutTien(soTien: Double): Boolean {
        if (soTien <= 0) {
            println("Số tiền rút phải lớn hơn 0")
            return false
        }

        if (soTien > soDu) {
            println("Số dư không đủ")
            return false
        }

        soDu -= soTien
        println("Đã rút: $soTien")
        return true
    }
}

fun main() {
    val taiKhoan = TaiKhoanNganHang("TK001", 1000000.0)

    taiKhoan.napTien(500000.0)
    println("Số dư sau khi nạp: ${taiKhoan.soDu}")

    println()

    val ketQuaRutLanMot = taiKhoan.rutTien(300000.0)
    println("Rút lần 1 thành công: $ketQuaRutLanMot")
    println("Số dư sau lần rút 1: ${taiKhoan.soDu}")

    println()

    val ketQuaRutLanHai = taiKhoan.rutTien(2000000.0)
    println("Rút lần 2 thành công: $ketQuaRutLanHai")
    println("Số dư sau lần rút 2: ${taiKhoan.soDu}")

    println()

    taiKhoan.napTien(100000.0)
    println("Số dư sau lần nạp tiếp theo: ${taiKhoan.soDu}")
}
