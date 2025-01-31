package com.dicoding.core.data.remote.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MealsResponseDto(

	@Json(name="meals")
	val meals: List<MealsItemDto?>? = null
)

@JsonClass(generateAdapter = true)
data class MealsItemDto(

	@Json(name="strImageSource")
	val strImageSource: Any? = null,

	@Json(name="strIngredient10")
	val strIngredient10: String? = null,

	@Json(name="strIngredient12")
	val strIngredient12: String? = null,

	@Json(name="strIngredient11")
	val strIngredient11: String? = null,

	@Json(name="strIngredient14")
	val strIngredient14: String? = null,

	@Json(name="strCategory")
	val strCategory: String? = null,

	@Json(name="strIngredient13")
	val strIngredient13: String? = null,

	@Json(name="strIngredient16")
	val strIngredient16: Any? = null,

	@Json(name="strIngredient15")
	val strIngredient15: String? = null,

	@Json(name="strIngredient18")
	val strIngredient18: Any? = null,

	@Json(name="strIngredient17")
	val strIngredient17: Any? = null,

	@Json(name="strArea")
	val strArea: String? = null,

	@Json(name="strCreativeCommonsConfirmed")
	val strCreativeCommonsConfirmed: Any? = null,

	@Json(name="strIngredient19")
	val strIngredient19: Any? = null,

	@Json(name="strTags")
	val strTags: String? = null,

	@Json(name="idMeal")
	val idMeal: String? = null,

	@Json(name="strInstructions")
	val strInstructions: String? = null,

	@Json(name="strIngredient1")
	val strIngredient1: String? = null,

	@Json(name="strIngredient3")
	val strIngredient3: String? = null,

	@Json(name="strIngredient2")
	val strIngredient2: String? = null,

	@Json(name="strIngredient20")
	val strIngredient20: Any? = null,

	@Json(name="strIngredient5")
	val strIngredient5: String? = null,

	@Json(name="strIngredient4")
	val strIngredient4: String? = null,

	@Json(name="strIngredient7")
	val strIngredient7: String? = null,

	@Json(name="strIngredient6")
	val strIngredient6: String? = null,

	@Json(name="strIngredient9")
	val strIngredient9: String? = null,

	@Json(name="strIngredient8")
	val strIngredient8: String? = null,

	@Json(name="strMealThumb")
	val strMealThumb: String? = null,

	@Json(name="strMeasure20")
	val strMeasure20: Any? = null,

	@Json(name="strYoutube")
	val strYoutube: String? = null,

	@Json(name="strMeal")
	val strMeal: String? = null,

	@Json(name="strMeasure12")
	val strMeasure12: String? = null,

	@Json(name="strMeasure13")
	val strMeasure13: String? = null,

	@Json(name="strMeasure10")
	val strMeasure10: String? = null,

	@Json(name="strMeasure11")
	val strMeasure11: String? = null,

	@Json(name="dateModified")
	val dateModified: Any? = null,

	@Json(name="strDrinkAlternate")
	val strDrinkAlternate: Any? = null,

	@Json(name="strSource")
	val strSource: Any? = null,

	@Json(name="strMeasure9")
	val strMeasure9: String? = null,

	@Json(name="strMeasure7")
	val strMeasure7: String? = null,

	@Json(name="strMeasure8")
	val strMeasure8: String? = null,

	@Json(name="strMeasure5")
	val strMeasure5: String? = null,

	@Json(name="strMeasure6")
	val strMeasure6: String? = null,

	@Json(name="strMeasure3")
	val strMeasure3: String? = null,

	@Json(name="strMeasure4")
	val strMeasure4: String? = null,

	@Json(name="strMeasure1")
	val strMeasure1: String? = null,

	@Json(name="strMeasure18")
	val strMeasure18: Any? = null,

	@Json(name="strMeasure2")
	val strMeasure2: String? = null,

	@Json(name="strMeasure19")
	val strMeasure19: Any? = null,

	@Json(name="strMeasure16")
	val strMeasure16: Any? = null,

	@Json(name="strMeasure17")
	val strMeasure17: Any? = null,

	@Json(name="strMeasure14")
	val strMeasure14: String? = null,

	@Json(name="strMeasure15")
	val strMeasure15: String? = null
)
