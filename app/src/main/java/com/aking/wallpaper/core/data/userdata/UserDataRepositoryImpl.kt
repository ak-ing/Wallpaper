package com.aking.wallpaper.core.data.userdata

import com.aking.wallpaper.core.model.UiTheme
import com.aking.wallpaper.core.model.UserData
import kotlinx.coroutines.flow.Flow

/**
 * @author Ak
 * 2026/3/6  16:37
 */
class UserDataRepositoryImpl : UserDataRepository {
    override val userData: Flow<UserData>
        get() = TODO("Not yet implemented")

    override suspend fun setUiTheme(uiTheme: UiTheme) {
        TODO("Not yet implemented")
    }
}