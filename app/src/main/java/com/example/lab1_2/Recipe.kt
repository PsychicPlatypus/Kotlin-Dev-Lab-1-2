package com.example.lab1_2

data class CakeRecipe(
    val name: String,
    val sections: List<BodySection>,
)

data class BodySection(
    val image: SectionImage? = null,
    val text: String = "",
)

data class SectionImage(
    val imageId: Int,
    val text: String,
)

val cakeRecipe = CakeRecipe(
    name = "Apple Pie Recipe",
    sections = listOf(
        BodySection(
            text = """      
                Ingredients are:
                1. Frozen Pie Base From Ica
                2. Apple Pie Filling From Ica
                3. Powdered Sugar (For Decoration)
            """.trimIndent()
        ),
        BodySection(
            image = SectionImage(
                imageId = R.drawable.apple_pie_finished,
                text = "Apple Pie Finished"
            ),
            text = """    
                Steps are:
                1. Preheat the oven to 200 degrees
                2. Put the pie base in the oven for 10 minutes
                3. Take out the pie base and pour the apple pie filling into the pie base
                4. Put the pie back in the oven for 20 minutes
                5. Take out the pie and let it cool down
                6. Decorate the pie with powdered sugar
                7. Eat with delight!
            """.trimIndent()
        ),
        BodySection(
            image = SectionImage(
                imageId = R.drawable.apple_pie_icon,
                text = "Apple Pie Icon"
            ),
        ),
        BodySection(
            text = """    
                This is the end of the recipe!
                
                For more amazing recipes, visit:
                https://www.ica.se/recept/
            """.trimIndent()
        )
    )
)
