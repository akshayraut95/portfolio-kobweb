package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.*
import com.sushanthande.portfolio.CircleButtonVariant
import com.sushanthande.portfolio.NavHeaderStyle
import com.sushanthande.portfolio.NavigationMenuStyle
import com.sushanthande.portfolio.UncoloredButtonVariant
import com.sushanthande.portfolio.utils.Res
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.functions.clamp
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.components.icons.CloseIcon
import com.varabyte.kobweb.silk.components.icons.HamburgerIcon
import com.varabyte.kobweb.silk.components.icons.MoonIcon
import com.varabyte.kobweb.silk.components.icons.SunIcon
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.components.overlay.Overlay
import com.varabyte.kobweb.silk.components.overlay.OverlayVars
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.*

@Composable
fun NavHeader(modifier: Modifier) {
    Row(
        NavHeaderStyle.toModifier().padding(top = 20.px, bottom = 20.px).then(
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
        Row(
            Modifier
                .fillMaxSize()
                .fontSize(1.5.cssRem)
                .gap(1.cssRem)
                .displayUntil(Breakpoint.MD)
                .margin(right = 20.px),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer()
            Row {
                var menuState by remember { mutableStateOf(SideMenuState.CLOSED) }

                ColorModeButton()
                HamburgerButton(onClick = { menuState = SideMenuState.OPEN })

                if (menuState != SideMenuState.CLOSED) {
                    SideMenu(
                        menuState,
                        close = { menuState = menuState.close() },
                        onAnimationEnd = { if (menuState == SideMenuState.CLOSING) menuState = SideMenuState.CLOSED }
                    )
                }
            }
        }

        Row(
            Modifier.gap(1.5.cssRem).displayIfAtLeast(Breakpoint.MD),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            MenuItems()
            ColorModeButton()
        }
    }
}

@Composable
private fun NavLink(path: String, text: String, onClick: () -> Unit) {
    Link(
        path,
        text,
        variant = UndecoratedLinkVariant.then(UncoloredLinkVariant),
        modifier = NavigationMenuStyle.toModifier().fontFamily(Res.Font.MONTSERRAT_BOLD).onClick { onClick() })
}

@Composable
fun MenuItems(onClick: () -> Unit = {}) {
    NavLink("#".plus(Res.String.HOME_TITLE), Res.String.HOME_TITLE.kebabCaseToTitleCamelCase()) { onClick() }
    NavLink("#".plus(Res.String.ABOUT_TITLE), Res.String.ABOUT_TITLE.kebabCaseToTitleCamelCase()) { onClick() }
    NavLink("#".plus(Res.String.SKILLS_TITLE), Res.String.SKILLS_TITLE.kebabCaseToTitleCamelCase()) { onClick() }
    NavLink("#".plus(Res.String.EXPERIENCE_TITLE), Res.String.EXPERIENCE_TITLE.kebabCaseToTitleCamelCase()) { onClick() }
    NavLink("#".plus(Res.String.PROJECTS_TITLE), Res.String.PROJECTS_TITLE.kebabCaseToTitleCamelCase()) { onClick() }
    NavLink("#".plus(Res.String.RECOMMENDATIONS_TITLE), Res.String.RECOMMENDATIONS_TITLE.kebabCaseToTitleCamelCase()) { onClick() }
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

@Composable
private fun HamburgerButton(onClick: () -> Unit) {
    IconButton(onClick) {
        HamburgerIcon(modifier = Modifier.size(24.px))
    }
}

@Composable
private fun CloseButton(onClick: () -> Unit) {
    IconButton(onClick) {
        CloseIcon()
    }
}

@Composable
private fun SideMenu(menuState: SideMenuState, close: () -> Unit, onAnimationEnd: () -> Unit) {
    Overlay(
        Modifier
            .setVariable(OverlayVars.BackgroundColor, Colors.Transparent)
            .onClick { close() }
    ) {
        key(menuState) { // Force recompute animation parameters when close button is clicked
            Column(
                Modifier
                    .fillMaxHeight()
                    .width(clamp(8.cssRem, 45.percent, 11.cssRem))
                    .align(Alignment.CenterEnd)
                    // Close button will appear roughly over the hamburger button, so the user can close
                    // things without moving their finger / cursor much.
                    .padding(top = 1.cssRem, leftRight = 1.cssRem)
                    .gap(1.5.cssRem)
                    .backgroundColor(if (ColorMode.current == ColorMode.LIGHT) Res.Colors.GREY else Res.Colors.GREY_DARK)
                    .animation(
                        SideMenuSlideInAnim.toAnimation(
                            duration = 200.ms,
                            timingFunction = if (menuState == SideMenuState.OPEN) AnimationTimingFunction.EaseOut else AnimationTimingFunction.EaseIn,
                            direction = if (menuState == SideMenuState.OPEN) AnimationDirection.Normal else AnimationDirection.Reverse,
                            fillMode = AnimationFillMode.Forwards
                        )
                    )
                    .borderRadius(topLeft = 2.cssRem)
                    .onClick { it.stopPropagation() }
                    .onAnimationEnd { onAnimationEnd() },
                horizontalAlignment = Alignment.End
            ) {
                CloseButton(onClick = { close() })
                Column(
                    Modifier.padding(right = 0.75.cssRem).gap(1.5.cssRem).fontSize(1.4.cssRem),
                    horizontalAlignment = Alignment.End
                ) {
                    MenuItems {
                        close()
                    }
                }
            }
        }
    }
}

val SideMenuSlideInAnim = Keyframes {
    from {
        Modifier.translateX(100.percent)
    }

    to {
        Modifier
    }
}

enum class SideMenuState {
    CLOSED,
    OPEN,
    CLOSING;

    fun close() = when (this) {
        CLOSED -> CLOSED
        OPEN -> CLOSING
        CLOSING -> CLOSING
    }
}