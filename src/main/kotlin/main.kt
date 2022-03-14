fun main() {

    val fee = 75
    val minFee = 3_500
    val amount = 1_000_000

    val sumFee = if (amount * fee / 10000 > minFee) amount * fee / 10000 else minFee
    println("Размер комиссии в копейках: $sumFee")
}