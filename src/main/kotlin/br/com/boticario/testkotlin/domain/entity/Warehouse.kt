package br.com.boticario.testkotlin.domain.entity

import br.com.boticario.testkotlin.domain.enum.WarehouseType

data class Warehouse(
  val locality: String,
  val quantity: Int,
  val type: WarehouseType
)
