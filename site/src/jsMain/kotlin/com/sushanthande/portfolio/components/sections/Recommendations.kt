package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.HeroSectionStyle
import com.sushanthande.portfolio.HoverCursorStyle
import com.sushanthande.portfolio.ShareButtonStyle
import com.sushanthande.portfolio.components.widgets.SectionTitle
import com.sushanthande.portfolio.models.LinkedinRecommendationModel
import com.sushanthande.portfolio.utils.DataRepository
import com.sushanthande.portfolio.utils.Res
import com.sushanthande.portfolio.utils.Res.String.RECOMMENDATIONS_TITLE
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun Recommendations(ctx: PageContext) {
    Column(
        modifier = HeroSectionStyle.toModifier().id(RECOMMENDATIONS_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(RECOMMENDATIONS_TITLE.kebabCaseToTitleCamelCase())

        SimpleGrid(
            numColumns = numColumns(base = 1, sm = 1, md = 1, lg = 1),
            modifier = Modifier.fillMaxWidth().padding(left = 20.px, right = 20.px, top = 20.px)
        ) {
            RecommendationItem(DataRepository.getMajorLinkedinRecommendation()) { selectedRecommendation ->
                ctx.router.navigateTo(selectedRecommendation.recommendationLink)
            }
        }

        SimpleGrid(
            numColumns = numColumns(base = 1, sm = 2, md = 3, lg = 3),
            modifier = Modifier.fillMaxWidth().padding(left = 20.px, right = 20.px)
        ) {
            DataRepository.getLinkedinRecommendations().forEach { linkedInRecommendation ->
                RecommendationItem(linkedInRecommendation, shouldShowRecommendation = false) { selectedRecommendation ->
                    ctx.router.navigateTo(selectedRecommendation.recommendationLink)
                }
            }
        }
    }
}

@Composable
fun RecommendationItem(
    recommendationModel: LinkedinRecommendationModel,
    shouldShowRecommendation: Boolean = true,
    modifier: Modifier = Modifier,
    onClick: (LinkedinRecommendationModel) -> Unit
) {
    Column(
        modifier = HoverCursorStyle.toModifier().then(
            modifier.border(
                0.1.px, LineStyle.Solid, Res.Colors.GREY
            ).borderRadius(r = 8.px).padding(10.px).margin(10.px)
        )
    ) {
        if (recommendationModel.authorName.isNotEmpty()) {
            Column(
                modifier = Modifier.padding(10.px).fillMaxWidth()
                    .onClick { onClick(recommendationModel) }) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = ShareButtonStyle.toModifier()
                            .then(Modifier.clip(shape = Rect(cornerRadius = 7.px)).height(40.px).width(40.px))
                    ) {
                        Image(
                            src = recommendationModel.profileImage,
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    Column {
                        SpanText(
                            text = recommendationModel.authorName,
                            modifier = Modifier
                                .color(
                                    when (ColorMode.current) {
                                        ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                                        ColorMode.DARK -> Colors.White
                                    }
                                )
                                .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                                .fontSize(13.px).margin(left = 10.px)
                        )

                        SpanText(
                            text = recommendationModel.designation,
                            modifier = Modifier
                                .color(
                                    when (ColorMode.current) {
                                        ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                                        ColorMode.DARK -> Colors.White
                                    }
                                )
                                .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                                .fontSize(11.px).margin(left = 10.px, top = 2.px)
                        )
                    }
                }
            }

            if (shouldShowRecommendation) {
                SpanText(
                    text = recommendationModel.recommendation,
                    modifier = Modifier
                        .color(
                            when (ColorMode.current) {
                                ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                                ColorMode.DARK -> Colors.White
                            }
                        )
                        .fontFamily(Res.Font.MONTSERRAT_MEDIUM)
                        .fontSize(12.px).margin(left = 10.px)
                        .margin(left = 10.px, top = 10.px)
                        .textAlign(
                            TextAlign.Justify
                        )
                )
            }

        } else {
            Column(
                modifier = modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
            ) {
                Row(
                    HoverCursorStyle.toModifier().onClick { onClick(recommendationModel) },
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    FaLinkedin(
                        modifier = Modifier.margin(left = 10.px),
                        size = IconSize.XXS
                    )

                    SpanText(
                        text = recommendationModel.recommendation,
                        modifier = Modifier.margin(left = 10.px)
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                                    ColorMode.DARK -> Colors.White
                                }
                            )
                            .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                            .fontSize(13.px)
                    )

                    Image(
                        src = when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Drawable.SHARE_ARROW_DARK
                            ColorMode.DARK -> Res.Drawable.SHARE_ARROW_LIGHT
                        },
                        modifier = Modifier.size(24.px).margin(left = 10.px)
                    )
                }
            }
        }
    }
}
