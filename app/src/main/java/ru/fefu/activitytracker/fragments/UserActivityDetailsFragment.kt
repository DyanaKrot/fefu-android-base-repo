package ru.fefu.activitytracker.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.FragmentUserActivityDetailsBinding
import ru.fefu.activitytracker.lists.ListItem

class UserActivityDetailsFragment(details: ListItem.Item) :
    BaseFragment<FragmentUserActivityDetailsBinding>(R.layout.fragment_user_activity_details) {
    private var _binding: FragmentUserActivityDetailsBinding? = null
    override val binding get() = _binding!!
    private val detail = details

    companion object {
        fun newInstance(info: ListItem.Item): UserActivityDetailsFragment {
            return UserActivityDetailsFragment(info)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textUserName.text = detail.user
        binding.textUserDistance.text = detail.distance
        binding.textUserDate.text = detail.date
        binding.textUserTime.text = detail.time
        binding.textUserStartTime.text = detail.startTime
        binding.textUserFinishTime.text = detail.endTime
        binding.toolbarUser.title = detail.activity
        binding.toolbarUser.setNavigationOnClickListener() {
            activity?.onBackPressed()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserActivityDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }
}