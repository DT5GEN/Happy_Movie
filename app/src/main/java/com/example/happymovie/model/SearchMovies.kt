package com.example.happymovie.model

data class SearchMovies(
    val title: TVMovies = getDefaultTitle(),
    val vote_average: Double,
    val poster_path: String,
    val backdrop_path: String,
    val original_lang: String,
    val vote_count: Int,
    val overview: String
)

fun getDefaultTitle() = TVMovies ("Мирное небо Донбасса", 7.0 ,
    "ссылка на постер", "ссылка на фон",
"Русский", 4007, "Русская фантастика о мирной интеграции Луганской и Донецкой области")
