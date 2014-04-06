package com.apple.eawt;

import com.apple.eawt.event.GestureUtilities;

import java.awt.Component;
import java.awt.Window;

import javax.swing.RootPaneContainer;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Utility class perform animated full screen actions to top-level {@link Window}s. This class
 * manages the relationship between {@link Window}s and the {@link FullScreenListener}s attached to
 * them. It's design is similar to the Java SE 6u10 com.sun.awt.AWTUtilities class which adds
 * additional functionality to AWT Windows, without adding new API to the {@link java.awt.Window}
 * class. Full screen operations can only be performed on top-level {@link Window}s that are also
 * {@link RootPaneContainer}s.
 *
 * @see FullScreenAdapter
 * @see GestureUtilities
 * @since Java for Mac OS X 10.7 Update 1
 */
public final class FullScreenUtilities {
	FullScreenUtilities() {
		//
	}

	/**
	 * Marks a {@link Window} as able to animate into or out of full screen mode. Only top-level
	 * {@link Window}s which are {@link RootPaneContainer}s are able to be animated into and out of
	 * full screen mode. The {@link Window} must be marked as full screen-able before the native
	 * peer is created with {@link Component#addNotify()}.
	 *
	 * @param window
	 * @param canFullScreen
	 * @throws IllegalArgumentException if window is not a {@link RootPaneContainer}
	 */
	public static void setWindowCanFullScreen(final Window window, final boolean canFullScreen) {
		//
	}

	/**
	 * Attaches a {@link FullScreenListener} to the specified top-level {@link Window}.
	 *
	 * @param window to attach the {@link FullScreenListener} to
	 * @param listener to be notified when a full screen event occurs
	 * @throws IllegalArgumentException if window is not a {@link RootPaneContainer}
	 */
	public static void addFullScreenListenerTo(final Window window, final FullScreenListener listener) {
		//
	}

	/**
	 * Removes a {@link FullScreenListener} from the specified top-level {@link Window}.
	 *
	 * @param window to remove the {@link FullScreenListener} from
	 * @param listener to be removed
	 * @throws IllegalArgumentException if window is not a {@link RootPaneContainer}
	 */
	public static void removeFullScreenListenerFrom(final Window window, final FullScreenListener listener) {
		//
	}
}
