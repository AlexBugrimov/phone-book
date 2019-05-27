package dev.bug.phonebook.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "pg_users")
data class User(

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var userId: Long,

        var firstName: String,

        var lastName: String,

        var createdAt: LocalDateTime,

        var updatedAt: LocalDateTime,

        @OneToMany(mappedBy = "pg_users", cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
        var phones: List<Phone> = emptyList()
)
