package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.sushanthande.portfolio.CircleButtonVariant
import com.sushanthande.portfolio.NavHeaderStyle
import com.sushanthande.portfolio.UncoloredButtonVariant
import com.sushanthande.portfolio.utils.Res
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.setVariable
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.components.icons.MoonIcon
import com.varabyte.kobweb.silk.components.icons.SunIcon
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.px

@Composable
fun NavHeader(modifier: Modifier) {
    Row(
        NavHeaderStyle.toModifier().displayIfAtLeast(Breakpoint.MD).padding(top = 20.px, bottom = 20.px).then(
            modifier.background(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Res.Colors.WHITE
                    ColorMode.DARK -> Res.Colors.GREEN_VOGUE
                }
            )
        ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        MenuItems()

        ColorModeButton()
    }
}

@Composable
private fun NavLink(path: String, text: String) {
    Link(path, text, variant = UndecoratedLinkVariant.then(UncoloredLinkVariant), modifier = Modifier.fontFamily(Res.Font.MONTSERRAT_BLACK))
}

@Composable
fun MenuItems() {
    NavLink("#".plus(Res.String.HOME_TITLE), Res.String.HOME_TITLE.kebabCaseToTitleCamelCase())
    NavLink("#".plus(Res.String.ABOUT_TITLE), Res.String.ABOUT_TITLE.kebabCaseToTitleCamelCase())
    NavLink("#".plus(Res.String.SKILLS_TITLE), Res.String.SKILLS_TITLE.kebabCaseToTitleCamelCase())
    NavLink("#".plus(Res.String.EXPERIENCE_TITLE), Res.String.EXPERIENCE_TITLE.kebabCaseToTitleCamelCase())
    NavLink("#".plus(Res.String.PROJECTS_TITLE), Res.String.PROJECTS_TITLE.kebabCaseToTitleCamelCase())
    NavLink("#".plus(Res.String.RECOMMENDATIONS_TITLE), Res.String.RECOMMENDATIONS_TITLE.kebabCaseToTitleCamelCase())
}

@Composable
private fun ColorModeButton() {
    var colorMode by ColorMode.currentState
    IconButton(onClick = { colorMode = colorMode.opposite }) {
        if (colorMode.isLight) MoonIcon() else SunIcon()
    }
}

@Composable
fun IconButton(
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Button(
        onClick = { onClick() },
        Modifier.setVariable(ButtonVars.FontSize, 1.em),
        variant = CircleButtonVariant.then(UncoloredButtonVariant)
    ) {
        content()
    }
}
