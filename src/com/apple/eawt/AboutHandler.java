package com.apple.eawt;

import com.apple.eawt.AppEvent.AboutEvent;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * An implementor receives notification when the app is asked to show it's about dialog.
 *
 * @see Application#setAboutHandler(AboutHandler)
 * @since Java for Mac OS X 10.6 Update 3
 * @since Java for Mac OS X 10.5 Update 8
 */
public interface AboutHandler {
	/**
	 * Called when the application is asked to show it's about dialog.
	 * 
	 * @param event the request to show the about dialog.
	 */
	public void handleAbout(final AboutEvent event);
}
