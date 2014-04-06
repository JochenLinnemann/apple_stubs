package com.apple.eawt;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Used to respond to a request to quit the application. The QuitResponse may be used after the
 * {@link QuitHandler#handleQuitRequestWith(AppEvent.QuitEvent, QuitResponse)} method has returned,
 * and may be used from any thread.
 *
 * @see Application#setQuitHandler(QuitHandler)
 * @see QuitHandler
 * @see Application#setQuitStrategy(QuitStrategy)
 * @since Java for Mac OS X 10.6 Update 3
 * @since Java for Mac OS X 10.5 Update 8
 */
public class QuitResponse {
	QuitResponse() {
		//
	}

	/**
	 * Notifies the external quit requester that the quit will proceed, and performs the default
	 * {@link QuitStrategy}.
	 */
	public void performQuit() {
		//
	}

	/**
	 * Notifies the external quit requester that the user has explicitly canceled the pending quit,
	 * and leaves the application running. <b>Note: this will cancel a pending log-out, restart, or
	 * shutdown.</b>
	 */
	public void cancelQuit() {
		//
	}
}
