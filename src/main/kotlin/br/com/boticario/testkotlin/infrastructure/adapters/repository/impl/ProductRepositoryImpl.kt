package br.com.boticario.testkotlin.infrastructure.adapters.repository.impl

import br.com.boticario.testkotlin.domain.entity.Product
import br.com.boticario.testkotlin.domain.repository.ProductRepository
import br.com.boticario.testkotlin.infrastructure.adapters.repository.ProductJpaRepository
import br.com.boticario.testkotlin.infrastructure.persistence.entity.ProductEntity
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
class ProductRepositoryImpl(private val productJpaRepository: ProductJpaRepository) : ProductRepository {
    override fun save(product: Product) = productJpaRepository.save(ProductEntity.fromDomain(product)).toDomain()

    override fun findOne(sku: Long) = productJpaRepository.findByIdOrNull(sku)?.toDomain()

    override fun deleteOne(sku: Long) {
      productJpaRepository.deleteById(sku)
    }
}
