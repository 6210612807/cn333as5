package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean,
    @ColumnInfo(name = "is_family") val isFamily: Boolean,




    ) {
    companion object {
        val DEFAULT_CONTACTS = listOf(
            ContactDbModel(1, "Tharm Pholsrisuthikul", "0835937732", false, false, 1, false,false),
            ContactDbModel(2, "Guy", "0838675433", false, false, 2, false,false),
            ContactDbModel(3, "Adams", "0824890324", false, false, 3, false,false),
            ContactDbModel(4, "Carter", "0893428971", false, false, 4, false, false),
            ContactDbModel(5, "ฺBell Edwards ", "0823470812", false, false, 5, false,false),

        )
    }
}
