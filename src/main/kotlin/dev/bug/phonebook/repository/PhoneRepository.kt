package dev.bug.phonebook.repository

import dev.bug.phonebook.model.Phone
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PhoneRepository : JpaRepository<Phone, Long> {
}