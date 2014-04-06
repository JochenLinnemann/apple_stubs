package com.apple.eawt;

import com.apple.eawt.AppEvent.AppForegroundEvent;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Implementors are notified when the app becomes the foreground app and when it resigns being the
 * foreground app. This notification is useful for hiding and showing transient UI like palette
 * windows which should be hidden when the app is in the background.
 *
 * @see Application#addAppEventListener(AppEventListener)
 * @since Java for Mac OS X 10.6 Update 3
 * @since Java for Mac OS X 10.5 Update 8
 */
public interface AppForegroundListener extends AppEventListener {
	/**
	 * Called when the app becomes the foreground app.
	 * 
	 * @param event the app became foreground notification.
	 */
	public void appRaisedToForeground(final AppForegroundEvent event);

	/**
	 * Called when the app resigns to the background and another app becomes the foreground app.
	 * 
	 * @param event the app resigned foreground notification.
	 */
	public void appMovedToBackground(final AppForegroundEvent event);
}
