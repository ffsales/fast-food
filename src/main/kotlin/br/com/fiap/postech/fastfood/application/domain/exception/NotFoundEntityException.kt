package br.com.fiap.postech.fastfood.application.domain.exception

class NotFoundEntityException(s: String, exception: Exception?): Exception(s, exception)
{
    constructor(s: String) : this(s, null)
}