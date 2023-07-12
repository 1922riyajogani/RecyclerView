package com.example.recyclerview.Fragments

import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.Adapter.ChatsAdapter
import com.example.recyclerview.ProfileModel
import com.example.recyclerview.R.drawable.*
import com.example.recyclerview.R
import com.example.recyclerview.databinding.FragmentChatsBinding

//TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ChatsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChatsFragment : Fragment() {

    var imgs = arrayOf(img1,image2,image3,image4,image5,image6,image7,image8,image9,image10)
    var name = arrayOf("Mansi","Shivani","Hasti","Princy","Mitixa","Yesha","Nency","Dharmi","Bhumi","Bsc.it")
    private val TAG = "ChatsFragment"
    private var param1: String? = null
    private var param2: String? = null
    lateinit var binding: FragmentChatsBinding
    var dataList = ArrayList<ProfileModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatsBinding.inflate(layoutInflater)

        for (x in 0.. imgs.size-1){
            var data = ProfileModel(imgs[x],name[x])
            dataList.add(data)
        }

        binding.rcvChatsList.layoutManager = LinearLayoutManager(context)
        binding.rcvChatsList.adapter = ChatsAdapter(dataList)

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ChatsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChatsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}