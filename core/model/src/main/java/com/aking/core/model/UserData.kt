package com.aking.core.model

/**
 * @author Ak
 * 2026/2/26  17:12
 */
data class UserData(
    val uiTheme: UiTheme,
)

enum class UiTheme {
    FOLLOW_SYSTEM,
    DARK,
    LIGHT,
}