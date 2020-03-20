package com.baharlou.mylearn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.my_fragment.*

class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.my_fragment, container, false)!!

    companion object {

        fun newInstance(title: String): Fragment {
            val fragment = MyFragment()
            val args = Bundle()
            args.putString("frag", title)
            fragment.arguments = args
            return fragment
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        title.text = arguments!!.getString("frag")

    }
}