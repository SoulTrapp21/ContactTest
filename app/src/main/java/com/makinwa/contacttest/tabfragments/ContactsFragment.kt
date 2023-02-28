package com.makinwa.contacttest.tabfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.makinwa.contacttest.R
import com.makinwa.contacttest.Rows
import com.makinwa.contacttest.adapters.ContactsRecyclerViewAdapter


class ContactsFragment : Fragment() {


    private lateinit var adapter: ContactsRecyclerViewAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var rowsArrayList: ArrayList<Rows>

    lateinit var imgId: Array<Int>
    lateinit var titleId: Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInit()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = ContactsRecyclerViewAdapter(rowsArrayList)
        recyclerView.adapter = adapter

    }





    private fun dataInit() {


        imgId = arrayOf(
            R.drawable.e, R.drawable.m, R.drawable.c
        )

        rowsArrayList = arrayListOf<Rows>()

        titleId = arrayOf(
            "Ellie",
            "Madeline",
            "Cole"
        )

        for (i in imgId.indices) {
            val rows = Rows(imgId[1], titleId[1])
            rowsArrayList.add(rows)
        }
    }
}