package com.sushanthande.portfolio.pages

import androidx.compose.runtime.*
import com.sushanthande.portfolio.PageContentStyle
import com.sushanthande.portfolio.components.sections.*
import com.sushanthande.portfolio.utils.Res
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.document
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun HomePage() {
    val pageContext = rememberPageContext()
    Row(
        Modifier.fillMaxWidth()
    ) {
        PageLayout(Res.String.NAME) {
            Box {
                Column {
                    Home(ctx = pageContext)

                    About(colorMode = ColorMode.current)

                    Skills()

                    Experience()

                    Projects(ctx = pageContext)
                }
            }
        }
    }
}

@Composable
fun PageLayout(title: String, content: @Composable ColumnScope.() -> Unit) {

    LaunchedEffect(title) {
        document.title = title
    }

    Box(
        Modifier
            .fillMaxWidth()
            .minHeight(100.percent)
            .gridTemplateRows { size(1.fr); size(minContent) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            Modifier.fillMaxSize().gridRow(1),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(
                PageContentStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                content()
            }
        }
    }

    NavHeader(modifier = Modifier.position(Position.Fixed).top(0.px))
}