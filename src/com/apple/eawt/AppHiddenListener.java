package com.apple.eawt;

import com.apple.eawt.AppEvent.AppHiddenEvent;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Implementors are notified when the app is hidden or shown by the user. This notification is
 * helpful for discontinuing a costly animation if it's not visible to the user.
 *
 * @see Application#addAppEventListener(AppEventListener)
 * @since Java for Mac OS X 10.6 Update 3
 * @since Java for Mac OS X 10.5 Update 8
 */
public interface AppHiddenListener extends AppEventListener {
	/**
	 * Called the app is hidden.
	 * 
	 * @param event
	 */
	public void appHidden(final AppHiddenEvent event);

	/**
	 * Called when the hidden app is shown again (but not necessarily brought to the foreground).
	 * 
	 * @param event
	 */
	public void appUnhidden(final AppHiddenEvent event);
}
