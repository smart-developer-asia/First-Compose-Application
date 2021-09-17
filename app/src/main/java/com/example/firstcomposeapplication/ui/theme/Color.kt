package com.example.firstcomposeapplication.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.LocalElevationOverlay
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.unit.Dp

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

// My colors
val Yellow400 = Color(0xFFF6E547)
val Yellow600 = Color(0xFFF5CF1B)
val Yellow700 = Color(0xFFF3B711)
val Yellow800 = Color(0xFFF29F05)

val Blue200 = Color(0xFF9DA3FA)
val Blue400 = Color(0xFF4860F7)
val Blue500 = Color(0xFF0540F2)
val Blue800 = Color(0xFF001CCF)

val Red300 = Color(0xFFEA6D7E)
val Red800 = Color(0xFFD00036)

@Composable
fun Colors.compositedOnSurface(alpha: Float): Color {
    return onSurface.copy(alpha = alpha).compositeOver(surface)
}

@Composable
fun Colors.elevatedSurface(elevation: Dp): Color {
    return LocalElevationOverlay.current?.apply(color = this.surface, elevation = elevation) ?: this.surface
}