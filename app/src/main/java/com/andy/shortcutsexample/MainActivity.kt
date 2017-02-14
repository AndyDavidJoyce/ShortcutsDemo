package com.andy.shortcutsexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val ACTION_NEWEST = "${BuildConfig.APPLICATION_ID}.NEWEST"
        val ACTION_SEARCH = "${BuildConfig.APPLICATION_ID}.SEARCH"
        val ACTION_SETTINGS = "${BuildConfig.APPLICATION_ID}.SETTINGS"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getIntentAction()
    }

    private fun getIntentAction() {
        when(intent.action) {
            ACTION_NEWEST -> setSelectedText("Newest")
            ACTION_SEARCH -> setSelectedText("Search")
            ACTION_SETTINGS -> setSelectedText("Settings")
            else -> setSelectedText("No")
        }
    }

    private fun setSelectedText(shortcutText: String) {
        textShortcutName.text = String.format(getString(R.string.shortcut_selected_text), shortcutText)
    }
}
