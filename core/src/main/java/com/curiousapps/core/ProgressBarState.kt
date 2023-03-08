package com.curiousapps.core

sealed class ProgressBarState{

    object Loading: ProgressBarState()

    object Idle: ProgressBarState()
}