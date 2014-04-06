package com.apple.eawt;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * The strategy use to shut down the application, if Sudden Termination is not enabled.
 *
 * @see Application#setQuitHandler(QuitHandler)
 * @see Application#setQuitStrategy(QuitStrategy)
 * @see Application#enableSuddenTermination()
 * @see Application#disableSuddenTermination()
 * @since Java for Mac OS X 10.6 Update 3
 * @since Java for Mac OS X 10.5 Update 8
 */
public enum QuitStrategy {
	/**
	 * Shuts down the application by calling <code>System.exit(0)</code>. This is the default
	 * strategy.
	 */
	SYSTEM_EXIT_0,

	/**
	 * Shuts down the application by closing each window from back-to-front.
	 */
	CLOSE_ALL_WINDOWS
}
