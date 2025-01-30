package com.dicoding.core.di

import android.content.Context
import androidx.room.Room
import com.dicoding.core.data.local.Database
import com.dicoding.core.data.local.LocalDataSourceImpl
import com.dicoding.core.data.local.dao.MealDao
import com.dicoding.core.data.local.dao.MealFavoriteDao
import com.dicoding.core.domain.contract.source.LocalDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    @Singleton
    fun provideStoryDatabase(@ApplicationContext context: Context): Database {
        return Room.databaseBuilder(
            context.applicationContext,
            Database::class.java,
            "database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideMealDao(database: Database): MealDao = database.mealDao()

    @Provides
    fun provideMealFavoriteDao(database: Database): MealFavoriteDao = database.mealFavoriteDao()

    @Provides
    @Singleton
    fun provideLocalDataSource(mealDao: MealDao, mealFavoriteDao: MealFavoriteDao): LocalDataSource{
        return LocalDataSourceImpl(mealDao, mealFavoriteDao)
    }
}