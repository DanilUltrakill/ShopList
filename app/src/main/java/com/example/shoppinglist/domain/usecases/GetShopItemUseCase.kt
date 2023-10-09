package com.example.shoppinglist.domain.usecases

import com.example.shoppinglist.domain.ShopListRepository
import com.example.shoppinglist.domain.entity.ShopItem

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}