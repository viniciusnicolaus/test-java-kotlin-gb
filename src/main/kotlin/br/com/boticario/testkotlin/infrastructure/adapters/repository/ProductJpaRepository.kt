package br.com.boticario.testkotlin.infrastructure.adapters.repository

import br.com.boticario.testkotlin.infrastructure.persistence.entity.ProductEntity
import org.springframework.data.repository.CrudRepository

interface ProductJpaRepository : CrudRepository<ProductEntity, Long>
