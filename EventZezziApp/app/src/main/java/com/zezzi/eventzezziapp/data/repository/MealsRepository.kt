package com.zezzi.eventzezziapp.data.repository

import com.zezzi.eventzezziapp.data.networking.MealsWebService
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.await

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    suspend fun getMeals() {
        return try{
            val response =  withContext(Dispatchers.IO){
                webService.getMeals().await()
            }
            if(response.isSuccessful){
                response.body()
            }
            else{
                null
            }
        }
        catch(e: Exception){
            null
        }
    }
}