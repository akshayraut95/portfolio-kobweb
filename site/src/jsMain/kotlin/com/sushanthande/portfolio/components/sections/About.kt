package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.AboutStyle
import com.sushanthande.portfolio.SectionDescriptionStyle
import com.sushanthande.portfolio.components.widgets.SectionTitle
import com.sushanthande.portfolio.utils.Res
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode

@Composable
fun About() {
    Column(
        modifier = AboutStyle.toModifier().id(Res.String.ABOUT_TITLE),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Res.String.ABOUT_TITLE.kebabCaseToTitleCamelCase())

        SpanText(
            text = Res.String.ABOUT_TITLE,
            modifier = SectionDescriptionStyle.toModifier()
                .textAlign(TextAlign.Center)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.DimGray
                    }
                )
                .fontFamily()
        )
    }
}