package com.amna.ecommerceapplication.data

import com.amna.ecommerceapplication.R

object ProductData {
    val categories = listOf(
        ProductCategory(1,"Clothing", R.drawable.clothcategory),
        ProductCategory(2,"Electronics", R.drawable.elecategory),
        ProductCategory(3,"Food", R.drawable.foodcategory),
        ProductCategory(4,"Home", R.drawable.homecategory),
        ProductCategory(5,"Beauty", R.drawable.beautycategory),
        ProductCategory(6,"Jewellery", R.drawable.jewelcategory)

    )

    val products = listOf(
        Product(1,"Sweatshirt",999, R.drawable.cloth1,"Clothing"),
        Product(2,"Jeans",899, R.drawable.cloth2,"Clothing"),
        Product(3,"Dress",599, R.drawable.cloth3,"Clothing"),
        Product(4,"Jacket",1999, R.drawable.cloth4,"Clothing"),
        Product(5,"T-Shirt",499, R.drawable.cloth5,"Clothing"),
        Product(6,"Gown",2999, R.drawable.cloth6,"Clothing"),
        Product(7,"Air Conditioner",50000, R.drawable.elec1,"Electronics"),
        Product(8,"Television",6000, R.drawable.elec2,"Electronics"),
        Product(9,"Laptop",10000, R.drawable.elec3,"Electronics"),
        Product(10,"Speakers",5000, R.drawable.elec4,"Electronics"),
        Product(11,"Headphones",10000, R.drawable.elec5,"Electronics"),
        Product(12,"Juicer",8000, R.drawable.elec6,"Electronics"),
        Product(13,"Burger",500, R.drawable.food1,"Food"),
        Product(14,"Pizza",900, R.drawable.food2,"Food"),
        Product(15,"French Fries",100, R.drawable.food3,"Food"),
        Product(16,"Noodles",700, R.drawable.food4,"Food"),
        Product(17,"Cake",1200, R.drawable.food5,"Food"),
        Product(18,"Bedsheet",780, R.drawable.home1,"Home"),
        Product(19,"Clock",650, R.drawable.home2,"Home"),
        Product(20,"Curtains",1220, R.drawable.home3,"Home"),
        Product(21,"Table",1800, R.drawable.home4,"Home"),
        Product(22,"Lipstick",400, R.drawable.beau1,"Beauty"),
        Product(23,"SunBlock",600, R.drawable.beau2,"Beauty"),
        Product(24,"Hair Brush",230, R.drawable.beau3,"Beauty"),
        Product(25,"Nail Polish",790, R.drawable.beau4,"Beauty"),
        Product(26,"Compact Powder",250, R.drawable.beau5,"Beauty"),
        Product(27,"Ring",100, R.drawable.jewl1,"Jewellery"),
        Product(28,"Necklace",190, R.drawable.jewl2,"Jewellery"),
        Product(29,"Bracelet",666, R.drawable.jewl3,"Jewellery"),
        Product(30,"Earrings",300, R.drawable.jewl4,"Jewellery"),
        Product(31,"Watch",566, R.drawable.jewl5,"Jewellery"),
        Product(32,"Bangles",680, R.drawable.jewl6,"Jewellery")
        )


}