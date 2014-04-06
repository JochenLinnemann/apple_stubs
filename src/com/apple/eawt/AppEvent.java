package com.apple.eawt;

import java.awt.Window;
import java.io.File;
import java.net.URI;
import java.util.EventObject;
import java.util.List;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * AppEvents are sent to listeners and handlers installed on the {@link Application}.
 *
 * @since Java for Mac OS X 10.6 Update 3
 * @since Java for Mac OS X 10.5 Update 8
 */
@SuppressWarnings({ "static-method", "unused" })
public abstract class AppEvent extends EventObject {
	AppEvent() {
		super(Application.getApplication());
	}

	/** Contains a list of files. */
	public abstract static class FilesEvent extends AppEvent {
		FilesEvent(final List<File> files) {
			//
		}

		/** @return the list of files */
		public List<File> getFiles() {
			return null;
		}
	}

	/**
	 * Event sent when the app is asked to open a list of files.
	 *
	 * @see OpenFilesHandler#openFiles(OpenFilesEvent)
	 */
	public static class OpenFilesEvent extends FilesEvent {
		OpenFilesEvent(final List<File> files, final String searchTerm) {
			super(files);
		}

		/**
		 * If the files were opened using the Spotlight search menu or a Finder search window, this
		 * method obtains the search term used to find the files. This is useful for highlighting
		 * the search term in the documents when they are opened.
		 *
		 * @return the search term used to find the files
		 */
		public String getSearchTerm() {
			return null;
		}
	}

	/**
	 * Event sent when the app is asked to print a list of files.
	 *
	 * @see PrintFilesHandler#printFiles(PrintFilesEvent)
	 */
	public static class PrintFilesEvent extends FilesEvent {
		PrintFilesEvent(final List<File> files) {
			super(files);
		}
	}

	/**
	 * Event sent when the app is asked to open a URI.
	 *
	 * @see OpenURIHandler#openURI(OpenURIEvent)
	 */
	public static class OpenURIEvent extends AppEvent {
		OpenURIEvent(final URI uri) {
			//
		}

		/** @return the URI the app was asked to open */
		public URI getURI() {
			return null;
		}
	}

	/**
	 * Event sent when the application is asked to open it's about window.
	 *
	 * @see AboutHandler#handleAbout(AboutEvent)
	 */
	public static class AboutEvent extends AppEvent {
		AboutEvent() {
			//
		}
	}

	/**
	 * Event sent when the application is asked to open it's preferences window.
	 *
	 * @see PreferencesHandler#handlePreferences(PreferencesEvent)
	 */
	public static class PreferencesEvent extends AppEvent {
		PreferencesEvent() {
			//
		}
	}

	/**
	 * Event sent when the application is asked to quit.
	 *
	 * @see QuitHandler#handleQuitRequestWith(QuitEvent, QuitResponse)
	 */
	public static class QuitEvent extends AppEvent {
		QuitEvent() {
			//
		}
	}

	/**
	 * Event sent when the application is asked to re-open itself.
	 *
	 * @see AppReOpenedListener#appReOpened(AppReOpenedEvent)
	 */
	public static class AppReOpenedEvent extends AppEvent {
		AppReOpenedEvent() {
			//
		}
	}

	/**
	 * Event sent when the application has become the foreground app, and when it has resigned being
	 * the foreground app.
	 *
	 * @see AppForegroundListener#appRaisedToForeground(AppForegroundEvent)
	 * @see AppForegroundListener#appMovedToBackground(AppForegroundEvent)
	 */
	public static class AppForegroundEvent extends AppEvent {
		AppForegroundEvent() {
			//
		}
	}

	/**
	 * Event sent when the application has been hidden or shown.
	 *
	 * @see AppHiddenListener#appHidden(AppHiddenEvent)
	 * @see AppHiddenListener#appUnhidden(AppHiddenEvent)
	 */
	public static class AppHiddenEvent extends AppEvent {
		AppHiddenEvent() {
			//
		}
	}

	/**
	 * Event sent when the user session has been changed via Fast User Switching.
	 *
	 * @see UserSessionListener#userSessionActivated(UserSessionEvent)
	 * @see UserSessionListener#userSessionDeactivated(UserSessionEvent)
	 */
	public static class UserSessionEvent extends AppEvent {
		UserSessionEvent() {
			//
		}
	}

	/**
	 * Event sent when the displays attached to the system enter and exit power save sleep.
	 *
	 * @see ScreenSleepListener#screenAboutToSleep(ScreenSleepEvent)
	 * @see ScreenSleepListener#screenAwoke(ScreenSleepEvent)
	 */
	public static class ScreenSleepEvent extends AppEvent {
		ScreenSleepEvent() {
			//
		}
	}

	/**
	 * Event sent when the system enters and exits power save sleep.
	 *
	 * @see SystemSleepListener#systemAboutToSleep(SystemSleepEvent)
	 * @see SystemSleepListener#systemAwoke(SystemSleepEvent)
	 */
	public static class SystemSleepEvent extends AppEvent {
		SystemSleepEvent() {
			//
		}
	}

	/**
	 * Event sent when a window is entering/exiting or has entered/exited full screen state.
	 *
	 * @see FullScreenUtilities
	 * @since Java for Mac OS X 10.7 Update 1
	 */
	public static class FullScreenEvent extends AppEvent {
		FullScreenEvent(final Window window) {
			//
		}

		/** @return window transitioning between full screen states */
		public Window getWindow() {
			return null;
		}
	}
}
