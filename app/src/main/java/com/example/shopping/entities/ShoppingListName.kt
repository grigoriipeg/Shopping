package com.example.shopping.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "shopping_list_name")
data class ShoppingListName (
    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "time")
    val time: String,

    @ColumnInfo(name = "allItemCount")
    val allItemCount: Int,

    @ColumnInfo(name = "checkedItemsCounter")
    val checkedItemsCounter: Int,

    @ColumnInfo(name = "itemsId")
    val itemId: String): java.io.Serializable
