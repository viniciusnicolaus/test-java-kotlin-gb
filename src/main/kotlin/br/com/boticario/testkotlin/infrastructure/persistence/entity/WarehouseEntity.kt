package br.com.boticario.testkotlin.infrastructure.persistence.entity

import br.com.boticario.testkotlin.domain.entity.Warehouse
import br.com.boticario.testkotlin.domain.enum.WarehouseType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class WarehouseEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Int = 0,
    private val locality: String = "",
    private val quantity: Int = 0,
    private val type: String = ""
) {
    fun toDomain() = Warehouse(
      locality,
      quantity,
      WarehouseType.valueOf(type)
    )

    companion object {
      fun fromDomain(warehouse: Warehouse) = WarehouseEntity(
        locality = warehouse.locality,
        quantity = warehouse.quantity,
        type = warehouse.type.name
      )
    }
}
