package com.apple.eawt;

import com.apple.eawt.AppEvent.FullScreenEvent;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Abstract adapter class for receiving fullscreen events. This class is provided as a convenience
 * for creating listeners. Subclasses registered with
 * {@link FullScreenUtilities#addFullScreenListenerTo(java.awt.Window, FullScreenListener)} will
 * receive all entering/entered/exiting/exited full screen events.
 *
 * @see FullScreenUtilities
 * @since Java for Mac OS X 10.7 Update 1
 */
public abstract class FullScreenAdapter implements FullScreenListener {
	@Override
	public void windowEnteringFullScreen(final FullScreenEvent event) {
		//
	}

	@Override
	public void windowEnteredFullScreen(final FullScreenEvent event) {
		//
	}

	@Override
	public void windowExitingFullScreen(final FullScreenEvent event) {
		//
	}

	@Override
	public void windowExitedFullScreen(final FullScreenEvent event) {
		//
	}
}
