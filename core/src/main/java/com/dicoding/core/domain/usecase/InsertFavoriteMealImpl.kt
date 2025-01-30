package com.dicoding.core.domain.usecase

import com.dicoding.core.domain.contract.repository.RecipeRepository
import com.dicoding.core.domain.contract.usecase.InsertFavoriteMealUseCase
import com.dicoding.core.domain.model.Meal

class InsertFavoriteMealImpl(
    private val repository: RecipeRepository
): InsertFavoriteMealUseCase {
    override suspend fun invoke(meal: Meal) {
        try {
            repository.insertFavoriteMealToDatabase(meal)
        } catch (e: Exception) {
            throw Exception("${e.message}")
        }
    }

}