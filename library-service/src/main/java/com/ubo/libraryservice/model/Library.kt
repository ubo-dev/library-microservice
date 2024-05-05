package com.ubo.bookservice.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "libraries")
data class Library @JvmOverloads constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    @ElementCollection
    val userBook: List<String> = ArrayList()
)
