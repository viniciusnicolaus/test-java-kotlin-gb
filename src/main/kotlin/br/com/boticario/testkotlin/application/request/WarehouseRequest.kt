package br.com.boticario.testkotlin.application.request

import br.com.boticario.testkotlin.domain.entity.Warehouse
import br.com.boticario.testkotlin.domain.enum.WarehouseType

data class WarehouseRequest(
    val locality: String,
    val quantity: Int,
    val type: WarehouseType
) {
    fun toDomain() = Warehouse(locality, quantity, type)
}
