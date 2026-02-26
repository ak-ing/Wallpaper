package com.aking.wallpaper.repository.userdata

import com.aking.wallpaper.model.UiTheme
import com.aking.wallpaper.model.UserData
import kotlinx.coroutines.flow.Flow

/**
 * @author Ak
 * 2026/2/26  16:40
 */
interface UserDataRepository {

    val userData: Flow<UserData>

    suspend fun setUiTheme(uiTheme: UiTheme)
}