package com.apple.eawt;

import com.apple.eawt.AppEvent.PreferencesEvent;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * An implementor is notified when the app is asked to show it's preferences UI.
 *
 * @see Application#setPreferencesHandler(PreferencesHandler)
 * @since Java for Mac OS X 10.6 Update 3
 * @since Java for Mac OS X 10.5 Update 8
 */
public interface PreferencesHandler {
	/**
	 * Called when the app is asked to show it's preferences UI.
	 * 
	 * @param event the request to show preferences.
	 */
	public void handlePreferences(final PreferencesEvent event);
}
