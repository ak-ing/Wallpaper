package com.aking.wallpaper.core.data.userdata

import com.aking.wallpaper.core.model.UiTheme
import com.aking.wallpaper.core.model.UserData
import kotlinx.coroutines.flow.Flow

/**
 * @author Ak
 * 2026/3/6  16:34
 */
interface UserDataRepository {

    val userData : Flow<UserData>

    suspend fun setUiTheme(uiTheme: UiTheme)
}