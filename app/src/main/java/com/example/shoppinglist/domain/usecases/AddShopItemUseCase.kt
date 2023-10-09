package com.example.shoppinglist.domain.usecases

import com.example.shoppinglist.domain.ShopListRepository
import com.example.shoppinglist.domain.entity.ShopItem

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}