package com.example.shoppinglist.domain.usecases

import com.example.shoppinglist.domain.ShopListRepository
import com.example.shoppinglist.domain.entity.ShopItem

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}