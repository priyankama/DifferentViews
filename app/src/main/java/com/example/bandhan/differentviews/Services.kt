package com.example.bandhan.differentviews

object Services {
    val foodcategories = listOf(
            Categories("North Indian","northindian"),
            Categories("South Indian","southinidan"),
            Categories("Chinese","chinese"),
            Categories("Desserts","dessert"),
            Categories("Drinks","drinks")
    )
    val north = listOf(
            Foods("naan","Rs.50","northindian1"),
            Foods("purisabji","Rs.40","northindian2"),
            Foods("thali","Rs.100","northindian3"),
            Foods("cholebature","Rs.60","northindian4")
    )
    val south = listOf(
            Foods("dosa","Rs.60","southinidan1"),
            Foods("thali","Rs.120","southinidan2"),
            Foods("uttpam","Rs.80","southinidan3"),
            Foods("kofte","Rs.30","southinidan4")

    )
    val chinese = listOf(
            Foods("chowmein","Rs.30","chinese1"),
            Foods("momos","Rs.40","chinese2"),
            Foods("crispy","Rs.30","chinese3"),
            Foods("special","Rs.50","chinese4")

    )

    val desserts = listOf(
            Foods("strawberry","Rs.100","dessert1"),
            Foods("layered","Rs.120","dessert2"),
            Foods("chocolate","Rs.100","dessert3"),
            Foods("softy","Rs.80","dessert4")

    )
    val drinks = listOf(
            Foods("virgin mojita","","drinks1"),
            Foods("red drink","","drinks2"),
            Foods("orange","","drinks3"),
            Foods("bluelagoon","","drinks4")

    )
    val noFood= listOf<Foods>()

    fun getFoodItems(category:String):List<Foods>{
        when(category){
            "Drinks"->return drinks
            "Desserts"->return desserts
            "Chinese"->return chinese
            "North Indian"->return north
            "South Indian"->return south
            else->return noFood
        }
    }
}