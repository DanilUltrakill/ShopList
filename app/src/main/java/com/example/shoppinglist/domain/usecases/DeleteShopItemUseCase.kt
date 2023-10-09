package com.example.shoppinglist.domain.usecases

import com.example.shoppinglist.domain.ShopListRepository
import com.example.shoppinglist.domain.entity.ShopItem

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}