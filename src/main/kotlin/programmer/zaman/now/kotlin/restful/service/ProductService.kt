package programmer.zaman.now.kotlin.restful.service

import programmer.zaman.now.kotlin.restful.model.CreateProductRequest
import programmer.zaman.now.kotlin.restful.model.ListProductRequest
import programmer.zaman.now.kotlin.restful.model.ProductResponse
import programmer.zaman.now.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>

}