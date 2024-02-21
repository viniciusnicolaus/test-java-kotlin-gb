package br.com.boticario.testkotlin.factory

import br.com.boticario.testkotlin.application.request.CreateProductRequest
import br.com.boticario.testkotlin.application.request.InventoryRequest
import br.com.boticario.testkotlin.application.request.UpdateProductRequest
import br.com.boticario.testkotlin.application.request.WarehouseRequest
import br.com.boticario.testkotlin.domain.entity.Product
import br.com.boticario.testkotlin.domain.enum.WarehouseType

object ProductFactory {
    private const val SKU = 1234L
    private const val UPDATE_NAME = "update to product 2"

    val warehousesRequest = mutableListOf(
      WarehouseRequest("SP", 10, WarehouseType.PHYSICAL_STORE),
      WarehouseRequest("RJ", 18, WarehouseType.ECOMMERCE)
    )
    val inventoryRequest = InventoryRequest(warehousesRequest)
    val createProductRequest = CreateProductRequest(SKU, "create product 1", inventoryRequest)
    val updateProductRequest = UpdateProductRequest(UPDATE_NAME)

    val createProduct = Product(
      createProductRequest.sku,
      createProductRequest.name,
      createProductRequest.inventory.toDomain()
    )
    val updateProduct = Product(
      SKU,
      updateProductRequest.name!!,
      createProduct.inventory
    )
}
