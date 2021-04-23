package com.example.simplechef

import android.content.Context
import android.content.Intent
import android.os.Build.VERSION_CODES.P
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.mylayout.view.*

class MainActivity : AppCompatActivity() {

    var adapter : FoodAdapter? = null

    var foodlist = ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foodlist.add(Food("Chicken Curry" , " There are over a thousand different kinds of curry. \n" +
                "\n" +
                "Today you will be learning the most basic, simple, and tasty curry recipe.\n" +
                "\n" +
                "Simply follow the steps and you will get your perfect curry.\n" +
                "\n" +
                "First, let’s get all the ingredients that are needed for this dish.\n" +
                "\n" +
                "Ingredients\n" +
                "\n" +
                "Oil \n" +
                "Coriander leaves\n" +
                "Onion \n" +
                "Tomato\n" +
                "Ginger\n" +
                "Garlic\n" +
                "Chilli powder\n" +
                "Chicken\n" +
                "Salt\n" +
                "\n" +
                "Once you have gotten all the ingredients follow these steps.\n" +
                "\n" +
                "Let’s first get a pot that you want to make the curry in. \n" +
                "Throughout the recipe, we are only going to use medium heat on the pan/pot\n" +
                "Once the pan is heated up add two spoons of oil.\n" +
                "Once the oil is heated up add chopped coriander leaves\n" +
                "Cook coriander leaves until soft\n" +
                "Add chopped onion\n" +
                "Cook the onion until it’s transparent and soft\n" +
                "While the onions cooking finely chop ginger and garlic\n" +
                "Add tomato and finely chopped ginger and garlic\n" +
                "Cook until tomato is soft and mushy\n" +
                "Add chicken and mix well and cook for 2 to 3 minutes\n" +
                "Add two spoons of chili powder [more if needed]\n" +
                "Add salt for taste\n" +
                "Cook for 10 to 15 minutes\n" +
                "\n" +
                "And this you go!!!!\n" +
                "\n" +
                "Simple and Tasty!!!!!\n" , R.drawable. chicken_curry))
        foodlist.add(Food("Pepper Chicken" , " This is a mixture of curry and fried chicken.\n" +
                "\n" +
                "Today you will be learning the most basic, simple, and tasty chicken recipe.\n" +
                "\n" +
                "Simply follow the steps and you will get your perfect Pepper Chicken.\n" +
                "\n" +
                "First, let’s get all the ingredients that are needed for this dish.\n" +
                "\n" +
                "Ingredients\n" +
                "Oil\n" +
                "Green chili\n" +
                "Chilli powder\n" +
                "Onion ½\n" +
                "Ginger\n" +
                "Garlic\n" +
                "Chicken\n" +
                "Salt\n" +
                "Pepper\n" +
                "Coriander leaves\n" +
                "Lime\n" +
                "\n" +
                "Once you have gotten all the ingredients follow these steps.\n" +
                "\n" +
                "Let’s first get a pot that you want to make the Pepper Chicken in. \n" +
                "Throughout the recipe, we are only going to use medium heat on the pan/pot\n" +
                "Once the pan is heated up add 2 to 3 spoons of oil\n" +
                "Once the oil is heated up add chili and chopped onion\n" +
                "Add finely chopped ginger and garlic\n" +
                "Cook till onion is soft and transparent\n" +
                "Add chicken and mix well and cook for three minutes\n" +
                "Add chili powder salt and four spoons of pepper\n" +
                "Mix and cook for 5 to 6 minutes\n" +
                "Finally, add chopped coriander leaves and squeeze one lime\n" +
                "\n" +
                "And this you go!!!!\n" +
                "\n" +
                "Simple and Tasty!!!!!\n " , R.drawable.pepper_chicken))
        foodlist.add(Food("Tomato Rice" , " Today you will be learning the most basic, simple, and tasty Rice recipe.\n" +
                "\n" +
                "Simply follow the steps and you will get your perfect Tomato Rice.\n" +
                "\n" +
                "First, let’s get all the ingredients that are needed for this dish.\n" +
                "\n" +
                "Ingredients\n" +
                "Oil\n" +
                "8 to 9 garlic gloves\n" +
                "Onion ½\n" +
                "Chilli\n" +
                "Two tomatoes\n" +
                "Chilli powder\n" +
                "One Cup of rice\n" +
                "Water\n" +
                "Coriander leaves\n" +
                "\n" +
                "Once you have gotten all the ingredients follow these steps.\n" +
                "\n" +
                "Let’s first get a pot that you want to make the Tomato Rice in. \n" +
                "Throughout the recipe, we are only going to use medium heat on the pan/pot\n" +
                "Once the pan is heated up add 2 to 3 spoons of oil\n" +
                "Add chopped garlic\n" +
                "Add chopped onion\n" +
                "Cook till onion is brown\n" +
                "Add chilli\n" +
                "Add the chopped tomatoes\n" +
                "Add chilli powder\n" +
                "Cook till tomato is soft and mushy\n" +
                "Now add 2 cups of water\n" +
                "Add the rice\n" +
                "Bring it to a boil\n" +
                "Add chopped coriander leaves\n" +
                "\n" +
                "And this you go!!!!\n" +
                "\n" +
                "Simple and Tasty!!!!!\n" +
                "\n " , R.drawable.tomato_rice))
        foodlist.add(Food("Fried Rice" , " Today you will be learning the most basic, simple, and Indian-style Fried Rice recipe.\n" +
                "\n" +
                "Simply follow the steps and you will get your perfect Indian-style Fried Rice.\n" +
                "\n" +
                "First, let’s get all the ingredients that are needed for this dish.\n" +
                "\n" +
                "Ingredients\n" +
                "Cook Rice\n" +
                "Onion \n" +
                "Beans \n" +
                "Carrots \n" +
                "Green onions \n" +
                "Soya Sauce\n" +
                "Salt \n" +
                "Pepper\n" +
                "Ginger \n" +
                "Garlic\n" +
                "\n" +
                "Once you have gotten all the ingredients follow these steps.\n" +
                "\n" +
                "Let’s first get a pan that you want to make the Indian-style Fried Rice in. \n" +
                "Throughout the recipe, we are only going to use medium heat on the pan/pot\n" +
                "Once the pan is heated up add 2 to 3 spoons of oil\n" +
                "Add garlic\n" +
                "Add onions\n" +
                "Cook till onions are brown and soft\n" +
                "Add finely chopped ginger\n" +
                "Add carrots\n" +
                "Add beans\n" +
                "Add chopped green onions\n" +
                "Add soy sauce\n" +
                "Add salt\n" +
                "Add pepper\n" +
                "And cook all of this for 4 to 5 minutes\n" +
                "Add to cook rice and mix well\n" +
                "\n" +
                "\n" +
                "And this you go!!!!\n" +
                "\n" +
                "Simple and Tasty!!!!!\n " , R.drawable. fried_rice))
        foodlist.add(Food("Lemon Rice" , " This is a mixture of curry and fried chicken.\n" +
                "\n" +
                "Today you will be learning the most basic, simple, and tasty chicken recipe.\n" +
                "\n" +
                "Simply follow the steps and you will get your perfect Pepper Chicken.\n" +
                "\n" +
                "First, let’s get all the ingredients that are needed for this dish.\n" +
                "\n" +
                "Ingredients\n" +
                "2 to 3 tablespoons of oil\n" +
                "Mustard seeds\n" +
                "Dried red chili\n" +
                "Curry leaves\n" +
                "Ginger\n" +
                "Turmeric powder\n" +
                "Pre-cooked rice\n" +
                "Salt\n" +
                "Lime juice\n" +
                "\n" +
                "Once you have gotten all the ingredients follow these steps.\n" +
                "\n" +
                "Let’s first get a pot that you want to make the Pepper Chicken in. \n" +
                "Throughout the recipe, we are only going to use medium heat on the pan/pot\n" +
                "Once the pan is heated up add 2 to 3 spoons of oil\n" +
                "Add a spoon of mustard seeds\n" +
                "Add dried red chili\n" +
                "Add chopped ginger\n" +
                "Add curry leaves \n" +
                "Cook for two minutes\n" +
                "Add turmeric powder\n" +
                "Add boiled rice\n" +
                "Some salt to taste\n" +
                "Add the lime juice\n" +
                "\n" +
                "\n" +
                "\n" +
                "And this you go!!!!\n" +
                "\n" +
                "Simple and Tasty!!!!!\n " , R.drawable.lemon_rice ))
        foodlist.add(Food("Fried Pasta" , " This is a mixture of curry and fried chicken.\n" +
                "\n" +
                "Today you will be learning the most basic, simple, and tasty chicken recipe.\n" +
                "\n" +
                "Simply follow the steps and you will get your perfect Pepper Chicken.\n" +
                "\n" +
                "First, let’s get all the ingredients that are needed for this dish.\n" +
                "\n" +
                "Ingredients\n" +
                "Oil\n" +
                "Cooked pasta\n" +
                "Green chili\n" +
                "Onion\n" +
                "Tomato\n" +
                "Ginger\n" +
                "Garlic\n" +
                "Mustard seed\n" +
                "Salt\n" +
                "Chilli powder\n" +
                "\n" +
                "Once you have gotten all the ingredients follow these steps.\n" +
                "\n" +
                "Let’s first get a pot that you want to make the Pepper Chicken in. \n" +
                "Throughout the recipe, we are only going to use medium heat on the pan/pot\n" +
                "Once the pan is heated up add 2 to 3 spoons of oil\n" +
                "Add mustard seed\n" +
                "Add onion\n" +
                "Add tomato\n" +
                "Add green chili\n" +
                "Add ginger and garlic\n" +
                "Cook for three minutes until they’re soft\n" +
                "Add salt\n" +
                "Add a tinge of chilli powder\n" +
                "Mix well\n" +
                "Add cooked pasta\n" +
                "Mix well\n" +
                "\n" +
                "\n" +
                "\n" +
                "And this you go!!!!\n" +
                "\n" +
                "Simple and Tasty!!!!!\n " , R.drawable. fried_pasta))

        adapter = FoodAdapter(this, foodlist)
        GridView.adapter = adapter
    }

    class FoodAdapter : BaseAdapter{

        var foolist = ArrayList<Food>()
        var context: Context? = null

        constructor(context: Context?, foolist: ArrayList<Food>) : super() {
            this.foolist = foolist
            this.context = context
        }


        override fun getView(index: Int, p1: View?, p2: ViewGroup?): View {
            var food = this.foolist[index]
            var inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE ) as LayoutInflater
            var foodview = inflater.inflate(R.layout.mylayout,null)
            foodview.imageView.setImageResource(food.image!!)
            foodview.textView.text = food.name!!
            foodview.imageView.setOnClickListener {
                var intent = Intent (context, FoodDetailsActivity::class.java)
                intent.putExtra("name",food.name!!)
                intent.putExtra("des",food.des!!)
                intent.putExtra("image",food.image!!)
                context!!.startActivity(intent)

            }
            return foodview
        }

        override fun getItem(p0: Int): Any {
            return p0
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
            return foolist.size
        }


    }
}