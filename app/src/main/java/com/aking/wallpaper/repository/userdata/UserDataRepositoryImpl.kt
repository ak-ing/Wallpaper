package com.aking.wallpaper.repository.userdata

import com.aking.wallpaper.model.UiTheme
import com.aking.wallpaper.model.UserData
import kotlinx.coroutines.flow.Flow

/**
 * @author Ak
 * 2026/2/26  16:43
 */
class UserDataRepositoryImpl : UserDataRepository {
    override val userData: Flow<UserData>
        get() = TODO("Not yet implemented")

    override suspend fun setUiTheme(uiTheme: UiTheme) {
        TODO("Not yet implemented")
    }
}