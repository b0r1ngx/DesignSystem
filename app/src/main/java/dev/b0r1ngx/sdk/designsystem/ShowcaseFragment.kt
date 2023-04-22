package dev.b0r1ngx.sdk.designsystem

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import dev.b0r1ngx.sdk.designsystem.databinding.FragmentShowcaseBinding
import dev.b0r1ngx.sdk.designsystem.design.DesignHelper

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
@SuppressLint("SetTextI18n")
class ShowcaseFragment : Fragment() {

    private var _binding: FragmentShowcaseBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var designHelper: DesignHelper

    val data = arrayOf("please don't", "swear at me", "I'm just", " RecyclerView :((")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentShowcaseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        designHelper = DesignHelper(requireContext(), binding.layout)
        with(designHelper) {
            useHeaderSubHeader(
                header = "I`ts Solution Cup 2023 !",
                subHeader = "*** a cool spring competition ***"
            )
            useHeader(header = "You must select a track here !")
            useHeaderSubHeaderButton(
                header = "Ну что ты с нами ?",
                subHeader = "может быть иначе ?!",
                buttonText = "Конечно участвую !",
                buttonOnClick =  ::onCornerButtonClick
            )
            useTitleDescription(
                title = "Теперь ты с нами",
                description = "но это не точно"
            )
            useTitleDescriptionClosable(
                title = "попробуй меня закрыть",
                description = "и у тебя не получится :c"
            )
            useHeaderWithVerticalItems(
                header = "А вот и треки",
                cornerButtonText = "* клик *",
                cornerButtonOnClick = ::onCornerButtonClick,
                data = data
            )
            useHeaderWithVerticalItemsAndButton(
                header = "А вот и треки",
                cornerButtonText = "* клик *",
                cornerButtonOnClick = ::onCornerButtonClick,
                data = data,
                buttonText = "клик клик !!!",
                buttonOnClick = ::onCornerButtonClick
            )
            useHeaderWithHorizontalItems(
                header = "Hello I'm RecyclerView",
                cornerButtonText = "* клик *",
                cornerButtonOnClick = ::onCornerButtonClick,
                data = data
            )
            useHeaderWithHorizontalItemsAndButton(
                header = "А вот и треки",
                cornerButtonText = "* клик *",
                cornerButtonOnClick = ::onCornerButtonClick,
                data = data,
                buttonText = "клик клик !!!",
                buttonOnClick = ::onCornerButtonClick
            )
        }
    }

    private fun onCornerButtonClick() {
        Snackbar.make(this.requireView(), "Replace with your own action", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}