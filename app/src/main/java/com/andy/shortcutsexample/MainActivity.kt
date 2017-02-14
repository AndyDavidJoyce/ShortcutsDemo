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
            ACTION_NEWEST -> setSelectedText("Newest Shortcut Selected")
            ACTION_SEARCH -> setSelectedText("Search Shortcut Selected")
            ACTION_SETTINGS -> setSelectedText("Settings Shortcut Selected")
            else -> setSelectedText("No Shortcut Selected")
        }
    }

    private fun setSelectedText(shortcutText: String) {
        textShortcutName.text = shortcutText
    }
}
