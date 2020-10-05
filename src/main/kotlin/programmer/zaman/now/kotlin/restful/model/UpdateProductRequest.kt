package programmer.zaman.now.kotlin.restful.model

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class UpdateProductRequest(

        @field:NotBlank
        val name: String?,

        @field:NotNull
        @field:Min(1)
        val price: Long?,

        @field:NotNull
        @field:Min(0)
        val quantity: Int?

)