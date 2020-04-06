package com.codingwithmitch.cleannotes.presentation

import android.view.View
import com.codingwithmitch.cleannotes.core.business.state.Response
import com.codingwithmitch.cleannotes.core.business.state.StateMessageCallback
import com.codingwithmitch.cleannotes.core.framework.DialogInputCaptureCallback

interface UIController {

    fun navNotesGraph()

    fun navRemindersGraph()

    fun navSettingsGraph()

    fun checkBottomNav(moduleName: String)

    fun displayToolbarTitle(title: String?, useAnimation: Boolean)

    fun displayBottomNav(isDisplayed: Boolean)

    fun displayProgressBar(isDisplayed: Boolean)

    fun hideSoftKeyboard()

    fun displayInputCaptureDialog(title: String, callback: DialogInputCaptureCallback)

    fun onResponseReceived(
        response: Response,
        stateMessageCallback: StateMessageCallback
    )

}


















