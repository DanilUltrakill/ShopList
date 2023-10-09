package com.example.shoppinglist.domain.usecases

import com.example.shoppinglist.domain.ShopListRepository
import com.example.shoppinglist.domain.entity.ShopItem

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}