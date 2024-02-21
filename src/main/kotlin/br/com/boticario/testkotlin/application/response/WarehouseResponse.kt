package br.com.boticario.testkotlin.application.response

import br.com.boticario.testkotlin.domain.entity.Warehouse
import br.com.boticario.testkotlin.domain.enum.WarehouseType

data class WarehouseResponse(
  val locality: String,
  val quantity: Int,
  val type: WarehouseType
) {
  companion object {
    fun fromDomain(warehouse: Warehouse) = WarehouseResponse(
      warehouse.locality,
      warehouse.quantity,
      warehouse.type
    )
  }
}
