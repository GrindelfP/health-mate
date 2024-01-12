package tech.onsibey.healthmate.domain

import java.sql.Time

/**
 * Class representation of a medicine, containing data
 * about its name, time when it is to be consumed,
 * its consume frequency, quantity and activeness.
 */
data class Medicine(
    val active: Boolean,
    val name: String,
    val quantity: Int,
    val consumeTime: Time,
    val consumeFrequency: ConsumeFrequency
)

/**
 * Consume frequency variants.
 */
enum class ConsumeFrequency {
    EVERYDAY, EVERY_OTHER_DAY, WEEKLY, MONTHLY, CUSTOM
}
