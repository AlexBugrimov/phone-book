package dev.bug.phonebook.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "pg_phones")
data class Phone (

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val phoneId: Long,

        val phone: String,

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "user_id")
        var company: User?,

        var createdAt: LocalDateTime,

        var updatedAt: LocalDateTime
)