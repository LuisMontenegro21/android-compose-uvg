package com.zezzi.eventzezziapp.data.repository

import com.zezzi.eventzezziapp.data.networking.MealsWebService
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.await

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    suspend fun getMeals(): mealsCategoryResponse {
        return webService.getMeals()
    }
}