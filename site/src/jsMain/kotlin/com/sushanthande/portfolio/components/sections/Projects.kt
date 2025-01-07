package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.HeroSectionStyle
import com.sushanthande.portfolio.ShareButtonStyle
import com.sushanthande.portfolio.components.widgets.SectionTitle
import com.sushanthande.portfolio.models.ProjectModel
import com.sushanthande.portfolio.utils.DataRepository
import com.sushanthande.portfolio.utils.Res
import com.sushanthande.portfolio.utils.Res.String.PROJECTS_TITLE
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun Projects(ctx: PageContext) {
    Column(
        modifier = HeroSectionStyle.toModifier().id(PROJECTS_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(PROJECTS_TITLE.kebabCaseToTitleCamelCase())

        Surface(modifier = Modifier.height(10.px)) {}

        SimpleGrid(
            numColumns = numColumns(base = 2, sm = 2, md = 3, lg = 3),
            modifier = Modifier.fillMaxWidth().padding(20.px)
        ) {
            DataRepository.getProjects().forEach { projectModel ->
                ProjectItem(projectModel) { selectedProjectModel ->
                    ctx.router.navigateTo(selectedProjectModel.appUrl)
                }
            }
        }
    }
}

@Composable
fun ProjectItem(projectModel: ProjectModel, modifier: Modifier = Modifier, onClick: (ProjectModel) -> Unit) {
    Column(
        modifier = modifier.border(
            0.1.px, LineStyle.Solid, Res.Colors.GREY
        ).borderRadius(r = 8.px).padding(10.px).margin(10.px)
    ) {
        if (projectModel.name.isNotEmpty()) {
            Column(modifier = Modifier.padding(10.px).fillMaxWidth()) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = ShareButtonStyle.toModifier()
                            .then(Modifier.clip(shape = Rect(cornerRadius = 7.px)).height(40.px).width(40.px))
                    ) {
                        Image(
                            src = projectModel.logo,
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    SpanText(
                        text = projectModel.name,
                        modifier = Modifier
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                                    ColorMode.DARK -> Colors.White
                                }
                            )
                            .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                            .fontSize(15.px).margin(left = 10.px)
                    )

                    Spacer()

                    Image(
                        src = Res.Drawable.PLAY_STORE,
                        modifier = ShareButtonStyle.toModifier().then(modifier.size(24.px))
                            .onClick { onClick(projectModel) }
                    )
                }
            }

            SpanText(
                text = Res.String.SKILLS_TITLE.kebabCaseToTitleCamelCase(),
                modifier = Modifier.width(40.px)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                    .fontSize(12.px).margin(left = 10.px)
                    .margin(left = 10.px, top = 10.px)
            )

            SpanText(
                text = projectModel.skills,
                modifier = Modifier.fillMaxWidth()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                    .fontSize(12.px).margin(left = 10.px, top = 5.px)

            )

            SpanText(
                text = Res.String.DESCRIPTION,
                modifier = Modifier.width(40.px)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                    .fontSize(12.px).margin(left = 10.px)
                    .margin(left = 10.px, top = 10.px)
            )

            SpanText(
                text = projectModel.description,
                modifier = Modifier
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                    .fontSize(12.px).margin(left = 10.px, right = 10.px, top = 5.px).textAlign(
                        TextAlign.Justify
                    )

            )
        } else {

            Column(
                modifier = modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    ShareButtonStyle.toModifier().onClick { onClick(projectModel) },
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        src = when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Drawable.GITHUB
                            ColorMode.DARK -> Res.Drawable.GITHUB_WHITE
                        },
                        modifier = Modifier.size(48.px)
                    )

                    SpanText(
                        text = projectModel.description,
                        modifier = Modifier
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                                    ColorMode.DARK -> Colors.White
                                }
                            )
                            .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                            .fontSize(12.px)
                            .margin(top = 10.px),
                    )
                }
            }
        }
    }
}

