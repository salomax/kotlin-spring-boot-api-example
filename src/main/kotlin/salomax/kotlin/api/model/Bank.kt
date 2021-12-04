package salomax.kotlin.api.model

/**
 * Created by marcos.salomao.
 */
data class Bank(
    val accountNumber: String,
    val transactionFee: Int,
    val trust: Double)