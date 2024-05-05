package com.ubo.bookservice.model

import jakarta.persistence.*

@Entity
@Table(name = "books")
data class Book @JvmOverloads constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,
    val title: String = "",
    val bookYear: String = "",
    val author: String = "",
    val pressName: String = "",
    val isbn: String = "",
)
