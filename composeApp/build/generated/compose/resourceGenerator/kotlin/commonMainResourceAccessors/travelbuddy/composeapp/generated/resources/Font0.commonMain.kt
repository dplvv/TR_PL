@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package travelbuddy.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.FontResource

private object CommonMainFont0 {
  public val raleway_light: FontResource by 
      lazy { init_raleway_light() }

  public val raleway_medium: FontResource by 
      lazy { init_raleway_medium() }

  public val raleway_regular: FontResource by 
      lazy { init_raleway_regular() }

  public val raleway_semibold: FontResource by 
      lazy { init_raleway_semibold() }
}

internal val Res.font.raleway_light: FontResource
  get() = CommonMainFont0.raleway_light

private fun init_raleway_light(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:raleway_light",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/travelbuddy.composeapp.generated.resources/font/raleway_light.ttf", -1, -1),
    )
)

internal val Res.font.raleway_medium: FontResource
  get() = CommonMainFont0.raleway_medium

private fun init_raleway_medium(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:raleway_medium",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/travelbuddy.composeapp.generated.resources/font/raleway_medium.ttf", -1, -1),
    )
)

internal val Res.font.raleway_regular: FontResource
  get() = CommonMainFont0.raleway_regular

private fun init_raleway_regular(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:raleway_regular",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/travelbuddy.composeapp.generated.resources/font/raleway_regular.ttf", -1, -1),
    )
)

internal val Res.font.raleway_semibold: FontResource
  get() = CommonMainFont0.raleway_semibold

private fun init_raleway_semibold(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:raleway_semibold",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/travelbuddy.composeapp.generated.resources/font/raleway_semibold.ttf", -1, -1),
    )
)
