package com.example.bandhan.differentviews

object Services {
    val foodcategories = listOf(
            Categories("North Indian","northindian"),
            Categories("South Indian","southinidan"),
            Categories("Chinese","chinese"),
            Categories("Desserts","desserts"),
            Categories("Drinks","drinks")
    )
    val north = listOf(
            Foods("naan","","northindian1"),
            Foods("purisabji","","northindian2"),
            Foods("thali","","northindian3"),
            Foods("cholebature","","northindian4")
    )
    val south = listOf(
            Foods("dosa","","southindian1"),
            Foods("thali","","southindian2"),
            Foods("uttpam","","southindian3"),
            Foods("kofte","","southindian4")

    )
    val chinese = listOf(
            Foods("chowmein","","chinese1"),
            Foods("momos","","chinese2"),
            Foods("crispy","","chinese3"),
            Foods("special","","chinese4")

    )

    val desserts = listOf(
            Foods("strawberry","","dessert1"),
            Foods("layered","","dessert2"),
            Foods("chocolate","","dessert3"),
            Foods("softy","","dessert4")

    )
    val drinks = listOf(
            Foods("virgin mojita","","drinks1"),
            Foods("red drink","","drinks2"),
            Foods("orange","","drinks3"),
            Foods("bluelagoon","","drinks4")

    )

}