package com.example.myfridgehome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*


open class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                val recipeButton = findViewById<Button>(R.id.BtnRecipes)
        recipeButton.setOnClickListener{
            val recipeIntent = Intent(this, RecipeActivity::class.java)
            startActivity(recipeIntent)
        }

        val fvtButton = findViewById<Button>(R.id.BtnFvtRecipes)
        fvtButton.setOnClickListener{
            val favoriteIntent = Intent(this, FavoriteActivity::class.java)
            startActivity(favoriteIntent)

        }

        val fridgeButton = findViewById<Button>(R.id.BtnMyFridge)
        fridgeButton.setOnClickListener{
            val fridgeIntent = Intent(this, MyFridgeActivity::class.java)
            startActivity(fridgeIntent)
        }

        val groceryButton = findViewById<Button>(R.id.BtnGrocery)
        groceryButton.setOnClickListener{
            val groceryIntent = Intent(this, GroceryActivity::class.java)
            startActivity(groceryIntent)

        }

}
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.my_fridge_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        // Maybe refactor to single service and inject services?
        when (item.itemId) {
            R.id.ActionBtnRecipes -> {
                val recipeActionIntent = Intent(this, RecipeActivity::class.java)
                startActivity(recipeActionIntent)
                return true
            }
            R.id.ActionBtnFavorites -> {
                val favoritesActionIntent = Intent(this, FavoriteActivity::class.java)
                startActivity(favoritesActionIntent)
                return true
            }
            R.id.ActionBtnMyFridge -> {
                val fridgeActionIntent = Intent(this, MyFridgeActivity::class.java)
                startActivity(fridgeActionIntent)
                return true
            }
            R.id.ActionBtnGrocery -> {
                val groceryActionIntent = Intent(this, GroceryActivity::class.java)
                startActivity(groceryActionIntent)
                return true
            }

        }


        return super.onOptionsItemSelected(item)
    }





    }
