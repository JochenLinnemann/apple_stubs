package com.apple.eawt;

import com.apple.eawt.AppEvent.UserSessionEvent;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Implementors receive notification when Fast User Switching changes the user session. This
 * notification is useful for discontinuing a costly animation, or indicating that the user is no
 * longer present on a network service.
 *
 * @see Application#addAppEventListener(AppEventListener)
 * @since Java for Mac OS X 10.6 Update 3
 * @since Java for Mac OS X 10.5 Update 8
 */
public interface UserSessionListener extends AppEventListener {
	/**
	 * Called when the user session has been switched away.
	 *
	 * @param event the user session switch event
	 */
	public void userSessionDeactivated(final UserSessionEvent event);

	/**
	 * Called when the user session has been switched to.
	 *
	 * @param event the user session switch event
	 */
	public void userSessionActivated(final UserSessionEvent event);
}
