package com.example.second_lab
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var myAdapter: MyAdapter
    private lateinit var itemList: MutableList<ItemModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        itemList = mutableListOf()
        itemList.add(ItemModel("Шаурма"))
        itemList.add(ItemModel("Люля"))
        itemList.add(ItemModel("Шашлык"))

        myAdapter = MyAdapter(this, itemList)
        recyclerView.adapter = myAdapter
    }
}