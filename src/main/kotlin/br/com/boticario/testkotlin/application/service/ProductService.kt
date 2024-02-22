package br.com.boticario.testkotlin.application.service

import br.com.boticario.testkotlin.application.request.CreateProductRequest
import br.com.boticario.testkotlin.application.request.UpdateProductRequest
import br.com.boticario.testkotlin.application.response.ProductResponse
import org.springframework.stereotype.Service

@Service
interface ProductService {
    fun insertProductInStock(request: CreateProductRequest): ProductResponse

    fun updateProductFromStock(request: UpdateProductRequest, sku: Long): ProductResponse

    fun getProductFromStock(sku: Long): ProductResponse

    fun deleteProductFromStock(sku: Long)
}
