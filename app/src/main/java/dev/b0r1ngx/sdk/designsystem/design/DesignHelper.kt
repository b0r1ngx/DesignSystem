package dev.b0r1ngx.sdk.designsystem.design

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.b0r1ngx.sdk.design.components.HorizontalAdapter
import dev.b0r1ngx.sdk.design.components.VerticalAdapter

class DesignHelper(
    private val context: Context,
    private val parent: View
) {

    fun useHeaderSubHeader(header: String, subHeader: String) {
        val layout = findConstraintLayout(dev.b0r1ngx.sdk.design.R.id.card_header_sub_header)

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.header).text = header
        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.sub_header).text = subHeader
    }

    fun useHeader(header: String) {
        val layout = findConstraintLayout(dev.b0r1ngx.sdk.design.R.id.card_header)

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.header).text = header
    }

    fun useHeaderSubHeaderButton(
        header: String,
        subHeader: String,
        buttonText: String,
        buttonOnClick: () -> Unit
    ) {
        val layout = findConstraintLayout(dev.b0r1ngx.sdk.design.R.id.card_header_sub_header_button)

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.header).text = header
        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.sub_header).text = subHeader
        layout.findViewById<Button>(dev.b0r1ngx.sdk.design.R.id.button).text = buttonText
        layout.findViewById<Button>(dev.b0r1ngx.sdk.design.R.id.button).setOnClickListener { buttonOnClick() }
    }

    fun useTitleDescription(title: String, description: String) {
        val layout = findConstraintLayout(dev.b0r1ngx.sdk.design.R.id.title_description)

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.title).text = title
        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.description).text = description
    }

    fun useTitleDescriptionClosable(title: String, description: String) {
        val layout = findConstraintLayout(dev.b0r1ngx.sdk.design.R.id.title_description_closable)

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.title).text = title
        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.description).text = description
    }

    fun useHeaderWithVerticalItems(
        header: String,
        cornerButtonText: String,
        cornerButtonOnClick: () -> Unit,
        data: Array<String>
    ) {
        val layout = findConstraintLayout(dev.b0r1ngx.sdk.design.R.id.items_vertical)

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.header).text = header

        val horizontalRecyclerView =
            layout.findViewById<RecyclerView>(dev.b0r1ngx.sdk.design.R.id.items)
        val verticalLayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val horizontalAdapter = VerticalAdapter(data)
        with(horizontalRecyclerView) {
            layoutManager = verticalLayoutManager
            adapter = horizontalAdapter
        }

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.corner_button).text =
            cornerButtonText
        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.corner_button)
            .setOnClickListener { cornerButtonOnClick() }
    }

    fun useHeaderWithVerticalItemsAndButton(
        header: String,
        cornerButtonText: String,
        cornerButtonOnClick: () -> Unit,
        data: Array<String>,
        buttonText: String,
        buttonOnClick: () -> Unit

    ) {
        val layout = findConstraintLayout(dev.b0r1ngx.sdk.design.R.id.items_vertical_button)

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.header).text = header

        val horizontalRecyclerView =
            layout.findViewById<RecyclerView>(dev.b0r1ngx.sdk.design.R.id.items)
        val verticalLayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val horizontalAdapter = VerticalAdapter(data)
        with(horizontalRecyclerView) {
            layoutManager = verticalLayoutManager
            adapter = horizontalAdapter
        }

        layout.findViewById<Button>(dev.b0r1ngx.sdk.design.R.id.button).text = buttonText
        layout.findViewById<Button>(dev.b0r1ngx.sdk.design.R.id.button).setOnClickListener { buttonOnClick() }
        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.corner_button).text =
            cornerButtonText
        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.corner_button)
            .setOnClickListener { cornerButtonOnClick() }
    }

    fun useHeaderWithHorizontalItems(
        header: String,
        cornerButtonText: String,
        cornerButtonOnClick: () -> Unit,
        data: Array<String>,
    ) {
        val layout = findConstraintLayout(dev.b0r1ngx.sdk.design.R.id.items_horizontal)

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.header).text = header

        val horizontalRecyclerView =
            layout.findViewById<RecyclerView>(dev.b0r1ngx.sdk.design.R.id.items)
        val horizontalLayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val horizontalAdapter = HorizontalAdapter(data)
        with(horizontalRecyclerView) {
            layoutManager = horizontalLayoutManager
            adapter = horizontalAdapter
        }

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.corner_button).text =
            cornerButtonText
        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.corner_button)
            .setOnClickListener { cornerButtonOnClick() }
    }

    fun useHeaderWithHorizontalItemsAndButton(
        header: String,
        cornerButtonText: String,
        cornerButtonOnClick: () -> Unit,
        data: Array<String>,
        buttonText: String,
        buttonOnClick: () -> Unit

    ) {
        val layout = findConstraintLayout(dev.b0r1ngx.sdk.design.R.id.items_horizontal_button)

        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.header).text = header

        val horizontalRecyclerView =
            layout.findViewById<RecyclerView>(dev.b0r1ngx.sdk.design.R.id.items)
        val horizontalLayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val horizontalAdapter = HorizontalAdapter(data)
        with(horizontalRecyclerView) {
            layoutManager = horizontalLayoutManager
            adapter = horizontalAdapter
        }

        layout.findViewById<Button>(dev.b0r1ngx.sdk.design.R.id.button).text = buttonText
        layout.findViewById<Button>(dev.b0r1ngx.sdk.design.R.id.button).setOnClickListener { buttonOnClick() }
        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.corner_button).text =
            cornerButtonText
        layout.findViewById<TextView>(dev.b0r1ngx.sdk.design.R.id.corner_button)
            .setOnClickListener { cornerButtonOnClick() }
    }

    private fun findConstraintLayout(@IdRes id: Int) = parent.findViewById<ConstraintLayout>(id)
}