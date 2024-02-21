package br.com.boticario.testkotlin.application.response

import br.com.boticario.testkotlin.domain.entity.Product

data class ProductResponse(
    val sku: Long,
    val name: String,
    val inventory: InventoryResponse,
    val isMarketable: Boolean
) {
    companion object {
      fun fromDomain(product: Product) = ProductResponse(
        product.sku,
        product.name,
        InventoryResponse.fromDomain(product.inventory),
        product.isMarketable
      )
    }
}
