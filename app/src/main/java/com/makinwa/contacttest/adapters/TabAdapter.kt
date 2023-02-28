package com.makinwa.contacttest.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.makinwa.contacttest.tabfragments.ContactsFragment
import com.makinwa.contacttest.tabfragments.FavoritesFragment
import com.makinwa.contacttest.tabfragments.RecentsFragment

class TabAdapter(var context: Context, var fragmentManager: FragmentManager, var tabTotal: Int) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return tabTotal
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FavoritesFragment()
            }
            1 -> {
                RecentsFragment()
            }
            2 -> {
                ContactsFragment()
            }

            else -> {
                return getItem(position)
            }
        }
    }
}