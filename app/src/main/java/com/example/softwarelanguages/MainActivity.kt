package com.example.softwarelanguages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var parentRecyclerView:RecyclerView
    private lateinit var parentList:ArrayList<ParentItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        parentRecyclerView=findViewById(R.id.parentRecyclerView)
        parentRecyclerView.setHasFixedSize(true)
        parentRecyclerView.layoutManager=LinearLayoutManager(this)


        parentList= ArrayList()


        prepareData()
        val adapter = ParentRecyclerViewAdapter(parentList)
        parentRecyclerView.adapter=adapter





    }
    private fun prepareData(){

        val childItems1=ArrayList<ChildItem>()
        childItems1.add(ChildItem("C",R.drawable.c))
        childItems1.add(ChildItem("C++",R.drawable.cplusplus))
        childItems1.add(ChildItem("Java",R.drawable.java))
        childItems1.add(ChildItem("C#",R.drawable.csharp))

        parentList.add(ParentItem("Game Development",R.drawable.gamedeve,childItems1))


        val childItems2=ArrayList<ChildItem>()
        childItems2.add(ChildItem("Kotlin",R.drawable.kotlin))
        childItems2.add(ChildItem("XML",R.drawable.xml))
        childItems2.add(ChildItem("Java",R.drawable.java))

        parentList.add(ParentItem("Android Development",R.drawable.android,childItems2))


        val childItems3=ArrayList<ChildItem>()
        childItems3.add(ChildItem("JavaScript",R.drawable.javascript))
        childItems3.add(ChildItem("HTML",R.drawable.htmll))
        childItems3.add(ChildItem("CSS",R.drawable.css))

        parentList.add(ParentItem("Front End Web",R.drawable.frontend,childItems3))


        val childItems4=ArrayList<ChildItem>()
        childItems4.add(ChildItem("PHP",R.drawable.php))
        childItems4.add(ChildItem("Ruby",R.drawable.ruby))
        childItems4.add(ChildItem("Python",R.drawable.python))
        childItems4.add(ChildItem("Go",R.drawable.go))

        parentList.add(ParentItem("Back End Web",R.drawable.backend,childItems4))

        val childItems5=ArrayList<ChildItem>()
        childItems5.add(ChildItem("R",R.drawable.ar))
        childItems5.add(ChildItem("Julia",R.drawable.julia))
        childItems5.add(ChildItem("Java",R.drawable.java))
        childItems5.add(ChildItem("Matlab",R.drawable.matlab))
        childItems5.add(ChildItem("Haskell",R.drawable.haskel))
        childItems5.add(ChildItem("C++",R.drawable.cplusplus))
        childItems5.add(ChildItem("Python",R.drawable.python))

        parentList.add(ParentItem("Artificial Intelligence ",R.drawable.artificial,childItems5))

        val childItems6=ArrayList<ChildItem>()
        childItems6.add(ChildItem("Java",R.drawable.java))
        childItems6.add(ChildItem("Python",R.drawable.python))
        childItems6.add(ChildItem("C",R.drawable.c))

        parentList.add(ParentItem("Cyber Security",R.drawable.siber,childItems6))

    }
}