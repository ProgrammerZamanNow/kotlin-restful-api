package programmer.zaman.now.kotlin.restful.controller

import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import programmer.zaman.now.kotlin.restful.error.NotFoundException
import programmer.zaman.now.kotlin.restful.error.UnauthorizedException
import programmer.zaman.now.kotlin.restful.model.WebResponse
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(constraintViolationException: ConstraintViolationException): WebResponse<String> {
        return WebResponse(
                code = 400,
                status = "BAD REQUEST",
                data = constraintViolationException.message!!
        )
    }

    @ExceptionHandler(value = [NotFoundException::class])
    fun notFound(notfoundException: NotFoundException): WebResponse<String> {
        return WebResponse(
                code = 404,
                status = "NOT FOUND",
                data = "Not Found"
        )
    }

    @ExceptionHandler(value = [UnauthorizedException::class])
    fun unauthorized(unauthorizedException: UnauthorizedException): WebResponse<String> {
        return WebResponse(
                code = 401,
                status = "UNAUTHORIZED",
                data = "Please put your X-Api-Key"
        )
    }

}