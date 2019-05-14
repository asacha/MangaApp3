package com.ascstb.mangaapp3.core

import timber.log.Timber

interface Navigation {
    fun navigateToLanding() {}

    enum class Screen(val tag: String) {
        LANDING("landing")
    }
}

class NavigationImpl : Navigation {
    private lateinit var currentScreen: Navigation.Screen

    override fun navigateToLanding() {
        super.navigateToLanding()
        Timber.d("NavigationImpl_TAG: navigateToLanding")
    }
}