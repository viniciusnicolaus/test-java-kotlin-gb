package br.com.boticario.testkotlin.domain.repository

import br.com.boticario.testkotlin.domain.entity.Product

interface ProductRepository {
  fun save(product: Product): Product

  fun findOne(sku: Long): Product?

  fun deleteOne(sku: Long)
}
